import pytest
from Subject import Subject
from Observer import AudioSystem, NavigationSystem, SecuritySystem


class MockObserver:
    """Mock observer for testing."""

    def __init__(self):
        self.received_events = []

    def update(self, event):
        self.received_events.append(event)


def test_attach_detach():
    """Test attaching and detaching observers."""
    car = Subject()
    observer = MockObserver()

    car.attach(observer)
    assert observer in car._observers

    car.detach(observer)
    assert observer not in car._observers


def test_notify():
    """Test notifying observers."""
    car = Subject()
    observer = MockObserver()
    car.attach(observer)

    car.notify("event_one")
    car.notify("event_two")

    assert observer.received_events == ["event_one", "event_two"]


def test_audio_system():
    """Test the audio system observer."""
    car = Subject()
    audio_system = AudioSystem()
    car.attach(audio_system)

    car.notify("start")  # Expect "Audio system: Playing welcome tune."
    car.notify("stop")  # Expect "Audio system: Turning off."
    car.notify("volume_up")  # Expect "Audio system: Increasing volume."
    car.notify("volume_down")  # Expect "Audio system: Decreasing volume."


def test_navigation_system():
    """Test the navigation system observer."""
    car = Subject()
    navigation_system = NavigationSystem()
    car.attach(navigation_system)

    car.notify("start")  # Expect "Navigation system: Starting navigation."
    car.notify("destination")  # Expect "Navigation system: Setting new destination."
    car.notify("route_guidance")  # Expect "Navigation system: Providing route guidance."


def test_security_system():
    """Test the security system observer."""
    car = Subject()
    security_system = SecuritySystem()
    car.attach(security_system)

    car.notify("start")  # Expect "Security system: Disarming."
    car.notify("stop")  # Expect "Security system: Arming."
    car.notify("door_open")  # Expect "Security system: Door open alert."
    car.notify("door_close")  # Expect "Security system: Door closed."