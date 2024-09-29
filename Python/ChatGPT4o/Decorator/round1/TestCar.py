from BasicCar import BasicCar
from AudioSystem import AudioSystem
from NavigationSystem import NavigationSystem


def test_basic_car():
    """Test the basic car's description and cost."""
    car = BasicCar()
    assert car.description() == "Basic Car"
    assert car.cost() == 10000

def test_car_with_audio_system():
    """Test the car with an audio system upgrade."""
    audio_car = AudioSystem(BasicCar())
    assert audio_car.description() == "Basic Car, Audio System"
    assert audio_car.cost() == 11500

def test_car_with_navigation_system():
    """Test the car with a navigation system upgrade."""
    nav_car = NavigationSystem(BasicCar())
    assert nav_car.description() == "Basic Car, Navigation System"
    assert nav_car.cost() == 12500