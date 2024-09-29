# observer_pattern.py

from abc import ABC, abstractmethod

class Observer(ABC):
    @abstractmethod
    def update(self, message: str):
        pass

class Car:
    def __init__(self):
        self._observers = []
        self._state = None

    def attach(self, observer: Observer):
        if observer not in self._observers:
            self._observers.append(observer)

    def detach(self, observer: Observer):
        if observer in self._observers:
            self._observers.remove(observer)

    def notify(self, message: str):
        for observer in self._observers:
            observer.update(message)

    def change_state(self, state: str):
        self._state = state
        self.notify(f"Car state changed to {state}")

class AudioSystem(Observer):
    def update(self, message: str):
        print(f"AudioSystem received: {message}")

class NavigationSystem(Observer):
    def update(self, message: str):
        print(f"NavigationSystem received: {message}")

class SecuritySystem(Observer):
    def update(self, message: str):
        print(f"SecuritySystem received: {message}")
