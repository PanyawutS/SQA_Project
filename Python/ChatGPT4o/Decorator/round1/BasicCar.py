from Car import Car

class BasicCar(Car):
    """A basic car with standard features."""

    def description(self):
        """Returns a description of the basic car."""
        return "Basic Car"

    def cost(self):
        """Returns the cost of the basic car."""
        return 10000
