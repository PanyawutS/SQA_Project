from Car import Car
from Decorator import audio_system, navigation_system, security_system


def test_base_car():
    basic_car = Car("Basic Model", 10000)
    assert basic_car.description() == "This is a Basic Model car."
    assert basic_car.price == 10000


def test_audio_decorator():
    car_with_audio = audio_system(Car("Audio Model", 10000))
    assert car_with_audio.description() == "This is a Audio Model car. It has an audio system."
    assert car_with_audio.price == 11000


def test_navigation_decorator():
    car_with_nav = navigation_system(Car("Nav Model", 10000))
    assert car_with_nav.description() == "This is a Nav Model car. It has a navigation system."
    assert car_with_nav.price == 11500


def test_security_decorator():
    car_with_security = security_system(Car("Security Model", 10000))
    assert car_with_security.description() == "This is a Security Model car. It has a security system."
    assert car_with_security.price == 12000


def test_combined_decorators():
    fully_loaded_car = security_system(
        navigation_system(audio_system(Car("Fully Loaded", 10000)))
    )
    assert fully_loaded_car.description() == (
        "This is a Fully Loaded car. It has an audio system. "
        "It has a navigation system. It has a security system."
    )
    assert fully_loaded_car.price == 14500
