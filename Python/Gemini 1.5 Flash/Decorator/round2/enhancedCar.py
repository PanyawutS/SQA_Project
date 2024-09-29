# enhanced_car.py

from Car import Car
from decorators import audio_system, navigation_system, security_system

@audio_system
@navigation_system
@security_system
class EnhancedCar(Car):
    pass
