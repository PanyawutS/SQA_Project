from Car import Car
from Decorator import CarFactory

def test_base_car():
    basic_car = Car("Basic Model", 10000)
    assert basic_car.description() == "This is a Basic Model car."
    assert basic_car.price == 10000


def test_audio_car():
    factory = CarFactory()
    audio_car = factory.create_audio_car(Car("Audio Model", 10000))
    assert audio_car.description() == "This is a Audio Model car. It has: audio system."
    assert audio_car.price == 11000


def test_nav_car():
    factory = CarFactory()
    nav_car = factory.create_nav_car(Car("Nav Model", 10000))
    assert nav_car.description() == "This is a Nav Model car. It has: navigation system."
    assert nav_car.price == 11500


def test_security_car():
    factory = CarFactory()
    security_car = factory.create_security_car(Car("Security Model", 10000))
    assert (
        security_car.description() == "This is a Security Model car. It has: security system."
    )
    assert security_car.price == 12000


def test_combined_features():
    factory = CarFactory()
    fully_loaded = factory.create_security_car(
        factory.create_nav_car(factory.create_audio_car(Car("Fully Loaded", 10000)))
    )
    assert (
        fully_loaded.description()
        == "This is a Fully Loaded car. It has: audio system, navigation system, security system."
    )
    assert fully_loaded.price == 14500