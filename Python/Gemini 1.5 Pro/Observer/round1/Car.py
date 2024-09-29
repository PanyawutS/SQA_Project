from Observer import Observer

class Car:
    """
    The Subject (Car) maintains a list of its dependents, called observers,
    and notifies them automatically of any state changes, usually by calling
    one of their methods.
    """

    def __init__(self):
        self._observers = []
        self._features = []

    def attach(self, observer: Observer):
        """Attach an observer to the car."""
        self._observers.append(observer)

    def detach(self, observer: Observer):
        """Detach an observer from the car."""
        self._observers.remove(observer)

    def notify(self):
        """Notify all observers about an update."""
        for observer in self._observers:
            observer.update(self)

    def add_feature(self, feature: str):
        """Add a new feature to the car."""
        self._features.append(feature)
        print(f"Car: Added feature: {feature}")
        self.notify()

    def get_features(self):
        """Get the list of features in the car."""
        return self._features
