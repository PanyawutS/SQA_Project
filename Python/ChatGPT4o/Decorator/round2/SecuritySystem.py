from CarDecorator import CarDecorator

class SecuritySystem(CarDecorator):
    def description(self):
        return self._car.description() + ", Security System"
    
    def cost(self):
        return self._car.cost() + 2000