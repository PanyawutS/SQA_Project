from Car import Car
from Feature import AudioSystem, NavigationSystem, SecuritySystem

if __name__ == "__main__":
    car = Car()

    audio = AudioSystem()
    navigation = NavigationSystem()
    security = SecuritySystem()

    car.add_feature(audio)
    car.add_feature(navigation)
    car.add_feature(security)

    car.state = "audio_on"
    car.state = "navigation_on"
    car.state = "security_on"

    car.state = "audio_off"
    car.state = "navigation_off"
    car.state = "security_off"
