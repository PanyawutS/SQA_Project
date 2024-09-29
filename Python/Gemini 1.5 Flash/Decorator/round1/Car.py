# car.py

class Car:
    def __init__(self, model):
        self.model = model

    def start(self):
        print(f"Starting {self.model} car")

    def stop(self):
        print(f"Stopping {self.model} car")

    def drive(self):
        print(f"Driving {self.model} car")
