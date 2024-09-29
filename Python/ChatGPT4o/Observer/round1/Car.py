from abc import ABC, abstractmethod

# Subject (Observable)
class Car(ABC):
    def __init__(self):
        self._observers = []

    def add_feature(self, observer):
        self._observers.append(observer)

    def remove_feature(self, observer):
        self._observers.remove(observer)

    def notify(self):
        for observer in self._observers:
            observer.update(self)

# Concrete Subject
class MyCar(Car):
    def __init__(self):
        super().__init__()
        self._state = None

    @property
    def state(self):
        return self._state

    @state.setter
    def state(self, state):
        self._state = state
        self.notify()
