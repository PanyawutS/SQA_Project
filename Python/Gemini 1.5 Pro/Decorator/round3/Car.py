class Car:
    """Represents a basic car."""

    def __init__(self, model, price):
        self.model = model
        self.price = price
        self.features = []  # Store added features

    def description(self):
        base_description = f"This is a {self.model} car."
        if self.features:
            base_description += " It has: " + ", ".join(self.features) + "."
        return base_description