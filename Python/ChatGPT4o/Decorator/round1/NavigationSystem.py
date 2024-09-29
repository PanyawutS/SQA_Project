from CarDecorator import CarDecorator

class NavigationSystem(CarDecorator):
    """Decorator class for adding a navigation system to a car."""

    def description(self):
        """Adds a navigation system to the car description."""
        return self._car.description() + ", Navigation System"

    def cost(self):
        """Adds the cost of a navigation system to the car."""
        return self._car.cost() + 2500