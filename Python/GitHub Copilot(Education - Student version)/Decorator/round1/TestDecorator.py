import pytest
from Car import BasicCar
from Decorator import AudioSystem, NavigationSystem, SecuritySystem

def test_basic_car():
    car = BasicCar()
    assert car.get_description() == "Basic Car"
    assert car.get_cost() == 10000.0

def test_audio_system():
    car = AudioSystem(BasicCar())
    assert car.get_description() == "Basic Car + Audio System"
    assert car.get_cost() == 11500.0

def test_navigation_system():
    car = NavigationSystem(BasicCar())
    assert car.get_description() == "Basic Car + Navigation System"
    assert car.get_cost() == 12000.0

def test_security_system():
    car = SecuritySystem(BasicCar())
    assert car.get_description() == "Basic Car + Security System"
    assert car.get_cost() == 12500.0

def test_all_features():
    car = SecuritySystem(NavigationSystem(AudioSystem(BasicCar())))
    assert car.get_description() == "Basic Car + Audio System + Navigation System + Security System"
    assert car.get_cost() == 16000.0
