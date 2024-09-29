# decorators.py

def audio_system(func):
    def wrapper(self, *args, **kwargs):
        print("Turning on the audio system")
        func(self, *args, **kwargs)
        print("Turning off the audio system")
    return wrapper


def navigation_system(func):
    def wrapper(self, *args, **kwargs):
        print("Navigating to destination")
        func(self, *args, **kwargs)
        print("Navigation completed")
    return wrapper


def security_system(func):
    def wrapper(self, *args, **kwargs):
        print("Activating security system")
        func(self, *args, **kwargs)
        print("Deactivating security system")
    return wrapper
