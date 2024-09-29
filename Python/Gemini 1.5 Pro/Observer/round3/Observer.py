from abc import ABC, abstractmethod


class Observer(ABC):
    """
    The Observer interface declares the update method, used by subjects.
    """

    @abstractmethod
    def update(self, subject, feature):
        """Receive update from subject."""
        pass


class AudioSystem(Observer):
    """
    Concrete Observers react to the updates issued by the Subject they had been
    attached to.
    """

    def update(self, subject, feature):
        """React to the car update."""
        if feature == "Audio System":
            print("AudioSystem: Reacting to car update: Audio system installed.")


class NavigationSystem(Observer):
    """
    Concrete Observers react to the updates issued by the Subject they had been
    attached to.
    """

    def update(self, subject, feature):
        """React to the car update."""
        if feature == "Navigation System":
            print(
                "NavigationSystem: Reacting to car update: Navigation system installed."
            )


class SecuritySystem(Observer):
    """
    Concrete Observers react to the updates issued by the Subject they had been
    attached to.
    """

    def update(self, subject, feature):
        """React to the car update."""
        if feature == "Security System":
            print("SecuritySystem: Reacting to car update: Security system installed.")