from enhancedCar import EnhancedCar
from capsys import capsys

class TestCar:

    def test_start(self):
        car = EnhancedCar("Tesla")
        car.start()
        assert "Starting Tesla car" in capsys.readouterr().out

    def test_stop(self):
        car = EnhancedCar("Tesla")
        car.stop()
        assert "Stopping Tesla car" in capsys.readouterr().out

    def test_drive(self):
        car = EnhancedCar("Tesla")
        car.drive()
        assert "Driving Tesla car" in capsys.readouterr().out

    def test_audio_system(self):
        car = EnhancedCar("Tesla")
        car.start()
        assert "Turning on the audio system" in capsys.readouterr().out
        assert "Turning off the audio system" in capsys.readouterr().out

    def test_navigation_system(self):
        car = EnhancedCar("Tesla")
        car.drive()
        assert "Navigating to destination" in capsys.readouterr().out
        assert "Navigation completed" in capsys.readouterr().out

    def test_security_system(self):
        car = EnhancedCar("Tesla")
        car.start()
        assert "Activating security system" in capsys.readouterr().out
        assert "Deactivating security system" in capsys.readouterr().out