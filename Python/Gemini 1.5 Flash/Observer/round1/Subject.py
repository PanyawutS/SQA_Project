class Subject:
    """Represents the car, which is the subject of observation."""

    def __init__(self):
        self._observers = []

    def attach(self, observer):
        """Attach an observer to the car."""
        self._observers.append(observer)

    def detach(self, observer):
        """Detach an observer from the car."""
        self._observers.remove(observer)

    def notify(self, event):
        """Notify all observers about the event."""
        for observer in self._observers:
            observer.update(event)
