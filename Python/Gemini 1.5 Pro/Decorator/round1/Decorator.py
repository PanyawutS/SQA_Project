def audio_system(car):
    """Decorator to add an audio system to a car."""

    class AudioEquippedCar:
        def __init__(self):
            self.car = car
            self.audio_price = 1000

        def description(self):
            return self.car.description() + " It has an audio system."

        @property
        def price(self):
            return self.car.price + self.audio_price

    return AudioEquippedCar()


def navigation_system(car):
    """Decorator to add a navigation system to a car."""

    class NavEquippedCar:
        def __init__(self):
            self.car = car
            self.nav_price = 1500

        def description(self):
            return self.car.description() + " It has a navigation system."

        @property
        def price(self):
            return self.car.price + self.nav_price

    return NavEquippedCar()


def security_system(car):
    """Decorator to add a security system to a car."""

    class SecurityEquippedCar:
        def __init__(self):
            self.car = car
            self.security_price = 2000

        def description(self):
            return self.car.description() + " It has a security system."

        @property
        def price(self):
            return self.car.price + self.security_price

    return SecurityEquippedCar()
