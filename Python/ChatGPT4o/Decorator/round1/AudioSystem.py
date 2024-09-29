from CarDecorator import CarDecorator

class AudioSystem(CarDecorator):
    """Decorator class for adding an audio system to a car."""

    def description(self):
        """Adds an audio system to the car description."""
        return self._car.description() + ", Audio System"

    def cost(self):
        """Adds the cost of an audio system to the car."""
        return self._car.cost() + 1500