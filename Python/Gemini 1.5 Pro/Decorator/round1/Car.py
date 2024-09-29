class Car:
    """Represents a basic car."""

    def __init__(self, model, price):
        self.model = model
        self.price = price

    def description(self):
        return f"This is a {self.model} car."
