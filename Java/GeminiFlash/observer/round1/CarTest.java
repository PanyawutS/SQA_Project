package sqa_project.GeminiFlash.observer.round1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testAddFeature() {
        Car car = new CarImpl();
        AudioSystem audioSystem = new AudioSystem();
        car.addFeature(audioSystem);

        // Verify audioSystem is added
        assertTrue(car.getFeatures().contains(audioSystem));
    }

    @Test
    public void testRemoveFeature() {
        Car car = new CarImpl();
        AudioSystem audioSystem = new AudioSystem();
        car.addFeature(audioSystem);
        car.removeFeature(audioSystem);

        // Verify audioSystem is removed
        assertTrue(car.getFeatures().isEmpty());
    }

    @Test
    public void testNotifyObservers() {
        Car car = new CarImpl();
        AudioSystem audioSystem = new AudioSystem();
        NavigationSystem navigationSystem = new NavigationSystem();
        SecuritySystem securitySystem = new SecuritySystem();

        car.addFeature(audioSystem);
        car.addFeature(navigationSystem);
        car.addFeature(securitySystem);

        // Trigger notification
        car.notifyObservers();
    }
}