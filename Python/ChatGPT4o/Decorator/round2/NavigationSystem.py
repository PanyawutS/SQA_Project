from CarDecorator import CarDecorator

class NavigationSystem(CarDecorator):
    def description(self):
        return self._car.description() + ", Navigation System"
    def cost(self):
        return self._car.cost() + 2500