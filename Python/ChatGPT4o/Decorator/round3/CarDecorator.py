from Car import Car

class CarDecorator(Car):
    def __init__(self, car: Car):
        self._car = car
    
    def description(self):
        return self._car.description()
    
    def cost(self):
        return self._car.cost()
