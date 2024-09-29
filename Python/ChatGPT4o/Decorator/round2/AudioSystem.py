from CarDecorator import CarDecorator

class AudioSystem(CarDecorator):
    def description(self):
        return self._car.description() + ", Audio System"
    
    def cost(self):
        return self._car.cost() + 1500