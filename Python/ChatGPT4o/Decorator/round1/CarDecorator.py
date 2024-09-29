from Car import Car

class CarDecorator(Car):
    """Abstract decorator class for car features."""

    def __init__(self, car: Car):
        """Initializes the decorator with a car."""
        self._car = car

    def description(self):
        """Provides the description of the car with additional features."""
        return self._car.description()

    def cost(self):
        """Calculates the cost of the car with additional features."""
        return self._car.cost()
