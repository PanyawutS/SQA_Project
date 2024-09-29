from CarDecorator import CarDecorator

class SecuritySystem(CarDecorator):
    """Decorator class for adding a security system to a car."""

    def description(self):
        """Adds a security system to the car description."""
        return self._car.description() + ", Security System"

    def cost(self):
        """Adds the cost of a security system to the car."""
        return self._car.cost() + 2000