from abc import ABC, abstractmethod

# Subject (Observable)
class Car:
    def __init__(self):
        self._features = []
        self._state = None

    def add_feature(self, feature):
        self._features.append(feature)

    def remove_feature(self, feature):
        self._features.remove(feature)

    def notify(self):
        for feature in self._features:
            feature.update(self)

    @property
    def state(self):
        return self._state

    @state.setter
    def state(self, state):
        self._state = state
        self.notify()