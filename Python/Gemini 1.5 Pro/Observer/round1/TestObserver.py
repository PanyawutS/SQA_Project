import pytest
from Car import Car
from Observer import AudioSystem, NavigationSystem, SecuritySystem


def test_car_features():
    """Test adding features to the car and observer notifications."""
    car = Car()
    audio_system = AudioSystem()
    navigation_system = NavigationSystem()
    security_system = SecuritySystem()

    car.attach(audio_system)
    car.attach(navigation_system)
    car.attach(security_system)

    car.add_feature("Audio System")
    car.add_feature("Navigation System")
    car.add_feature("Security System")

    assert "Audio System" in car.get_features()
    assert "Navigation System" in car.get_features()
    assert "Security System" in car.get_features()


def test_observer_detach():
    """Test detaching an observer from the car."""
    car = Car()
    audio_system = AudioSystem()

    car.attach(audio_system)
    car.detach(audio_system)

    car.add_feature("Audio System")

    assert "Audio System" in car.get_features()
