from abc import ABC, abstractmethod

# Observer
class Feature(ABC):
    @abstractmethod
    def update(self, car):
        pass

# Concrete Observers
class AudioSystem(Feature):
    def update(self, car):
        if car.state == "audio_on":
            print("Audio System is now ON.")
        elif car.state == "audio_off":
            print("Audio System is now OFF.")

class NavigationSystem(Feature):
    def update(self, car):
        if car.state == "navigation_on":
            print("Navigation System is now ON.")
        elif car.state == "navigation_off":
            print("Navigation System is now OFF.")

class SecuritySystem(Feature):
    def update(self, car):
        if car.state == "security_on":
            print("Security System is now ON.")
        elif car.state == "security_off":
            print("Security System is now OFF.")
