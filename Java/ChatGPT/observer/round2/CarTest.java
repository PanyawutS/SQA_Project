package sqa_project.ChatGPT.observer.round2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void testAddAndNotifyObservers() {
        Car car = new Car();

        AudioSystem audioSystem = new AudioSystem();
        NavigationSystem navigationSystem = new NavigationSystem();
        SecuritySystem securitySystem = new SecuritySystem();

        car.addObserver(audioSystem);
        car.addObserver(navigationSystem);
        car.addObserver(securitySystem);

        car.setFeatureUpdate("Bluetooth enabled");

        assertEquals("Audio System: Bluetooth enabled", audioSystem.getFeatureUpdate());
        assertEquals("Navigation System: Bluetooth enabled", navigationSystem.getFeatureUpdate());
        assertEquals("Security System: Bluetooth enabled", securitySystem.getFeatureUpdate());
    }

    @Test
    public void testRemoveObserver() {
        Car car = new Car();

        AudioSystem audioSystem = new AudioSystem();
        NavigationSystem navigationSystem = new NavigationSystem();
        SecuritySystem securitySystem = new SecuritySystem();

        car.addObserver(audioSystem);
        car.addObserver(navigationSystem);
        car.addObserver(securitySystem);

        car.setFeatureUpdate("GPS tracking enabled");

        assertEquals("Audio System: GPS tracking enabled", audioSystem.getFeatureUpdate());
        assertEquals("Navigation System: GPS tracking enabled", navigationSystem.getFeatureUpdate());
        assertEquals("Security System: GPS tracking enabled", securitySystem.getFeatureUpdate());

        // Remove the Navigation System and update again
        car.removeObserver(navigationSystem);
        car.setFeatureUpdate("Anti-theft system enabled");

        assertEquals("Audio System: Anti-theft system enabled", audioSystem.getFeatureUpdate());
        assertEquals("Security System: Anti-theft system enabled", securitySystem.getFeatureUpdate());
        assertEquals("Navigation System: GPS tracking enabled", navigationSystem.getFeatureUpdate());  // No update after removal
    }
}
