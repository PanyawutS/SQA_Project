import pytest
from Observer import Car, AudioSystem, NavigationSystem, SecuritySystem


def test_attach_detach_observers():
    car = Car()
    audio = AudioSystem()
    nav = NavigationSystem()
    sec = SecuritySystem()

    car.attach(audio)
    car.attach(nav)
    car.attach(sec)

    assert len(car._observers) == 3

    car.detach(nav)
    assert len(car._observers) == 2

def test_notify_observers(capfd):
    car = Car()
    audio = AudioSystem()
    nav = NavigationSystem()
    sec = SecuritySystem()

    car.attach(audio)
    car.attach(nav)
    car.attach(sec)

    car.change_state("Engine On")

    captured = capfd.readouterr()
    assert "AudioSystem received: Car state changed to Engine On" in captured.out
    assert "NavigationSystem received: Car state changed to Engine On" in captured.out
    assert "SecuritySystem received: Car state changed to Engine On" in captured.out

def test_no_observers_notified(capfd):
    car = Car()
    car.change_state("Engine Off")

    captured = capfd.readouterr()
    assert captured.out == ""