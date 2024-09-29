from abc import ABC, abstractmethod

class Car(ABC):
    @abstractmethod
    def get_description(self) -> str:
        pass

    @abstractmethod
    def get_cost(self) -> float:
        pass

class BasicCar(Car):
    def get_description(self) -> str:
        return "Basic Car"

    def get_cost(self) -> float:
        return 10000.0
