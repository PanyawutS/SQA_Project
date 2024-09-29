from Car import Car

class CarDecorator(Car):
    def __init__(self, car: Car):
        self._car = car

    def get_description(self) -> str:
        return self._car.get_description()

    def get_cost(self) -> float:
        return self._car.get_cost()

class AudioSystem(CarDecorator):
    def get_description(self) -> str:
        return f"{self._car.get_description()} + Audio System"

    def get_cost(self) -> float:
        return self._car.get_cost() + 1500.0

class NavigationSystem(CarDecorator):
    def get_description(self) -> str:
        return f"{self._car.get_description()} + Navigation System"

    def get_cost(self) -> float:
        return self._car.get_cost() + 2000.0

class SecuritySystem(CarDecorator):
    def get_description(self) -> str:
        return f"{self._car.get_description()} + Security System"

    def get_cost(self) -> float:
        return self._car.get_cost() + 2500.0
