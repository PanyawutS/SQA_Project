class Observer:
    """Abstract base class for observers."""

    def update(self, event):
        """Receive notification about an event."""
        raise NotImplementedError


class AudioSystem(Observer):
    """Represents an audio system as an observer."""

    def update(self, event):
        """Respond to car events related to audio."""
        if event == "start":
            print("Audio system: Playing welcome tune.")
        elif event == "stop":
            print("Audio system: Turning off.")
        elif event == "volume_up":
            print("Audio system: Increasing volume.")
        elif event == "volume_down":
            print("Audio system: Decreasing volume.")


class NavigationSystem(Observer):
    """Represents a navigation system as an observer."""

    def update(self, event):
        """Respond to car events related to navigation."""
        if event == "start":
            print("Navigation system: Starting navigation.")
        elif event == "destination":
            print("Navigation system: Setting new destination.")


class SecuritySystem(Observer):
    """Represents a security system as an observer."""

    def update(self, event):
        """Respond to car events related to security."""
        if event == "start":
            print("Security system: Disarming.")
        elif event == "stop":
            print("Security system: Arming.")
