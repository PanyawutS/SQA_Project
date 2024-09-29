from abc import ABC, abstractmethod

class Observer(ABC):
    """
    The Observer interface declares the update method, used by subjects.
    """

    @abstractmethod
    def update(self, subject):
        """Receive update from subject."""
        pass


class AudioSystem(Observer):
    """
    Concrete Observers react to the updates issued by the Subject they had been
    attached to.
    """

    def update(self, subject):
        """React to the car update."""
        if "Audio System" in subject.get_features():
            print("AudioSystem: Reacting to car update: Audio system installed.")


class NavigationSystem(Observer):
    """
    Concrete Observers react to the updates issued by the Subject they had been
    attached to.
    """

    def update(self, subject):
        """React to the car update."""
        if "Navigation System" in subject.get_features():
            print("NavigationSystem: Reacting to car update: Navigation system installed.")


class SecuritySystem(Observer):
    """
    Concrete Observers react to the updates issued by the Subject they had been
    attached to.
    """

    def update(self, subject):
        """React to the car update."""
        if "Security System" in subject.get_features():
            print("SecuritySystem: Reacting to car update: Security system installed.")
