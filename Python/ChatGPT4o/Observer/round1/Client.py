from Car import MyCar
from Feature import AudioSystem, NavigationSystem, SecuritySystem

# Client code to demonstrate the pattern
if __name__ == "__main__":
    car = MyCar()

    audio = AudioSystem()
    navigation = NavigationSystem()
    security = SecuritySystem()

    car.add_feature(audio)
    car.add_feature(navigation)
    car.add_feature(security)

    # Setting the state of the car and triggering notifications
    car.state = "audio_on"
    car.state = "navigation_on"
    car.state = "security_on"

    car.state = "audio_off"
    car.state = "security_off"
