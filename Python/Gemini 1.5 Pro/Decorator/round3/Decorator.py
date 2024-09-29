
# decorators.py
def add_feature(feature_name, price):
    """Decorator to add a feature to a car."""

    def decorator(car_function):
        def wrapper(self, *args, **kwargs):
            self.price += price
            self.features.append(feature_name)
            return car_function(self, *args, **kwargs)

        return wrapper

    return decorator


class CarFactory:
    """Factory class to create cars with features."""

    @add_feature("audio system", 1000)
    def create_audio_car(self, car):
        return car

    @add_feature("navigation system", 1500)
    def create_nav_car(self, car):
        return car

    @add_feature("security system", 2000)
    def create_security_car(self, car):
        return car