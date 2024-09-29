package sqa_project.GeminiPro.observer.round3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarFeatureTest {

    @Test
    void testCarFeatureAddition() {
        // Create a basic car
        BasicCar car = new BasicCar();

        // Create observers
        AudioSystem audioSystem = new AudioSystem();
        NavigationSystem navigationSystem = new NavigationSystem();
        SecuritySystem securitySystem = new SecuritySystem();

        // Attach observers to the car
        car.attach(audioSystem);
        car.attach(navigationSystem);
        car.attach(securitySystem);

        // Add features to the car
        car.addFeature("Audio System");
        car.addFeature("Navigation System");
        car.addFeature("Security System");

        // Assertions to check if features are installed
        assertTrue(car.hasFeature("Audio System"));
        assertTrue(audioSystem.isInstalled());

        assertTrue(car.hasFeature("Navigation System"));
        assertTrue(navigationSystem.isInstalled());

        assertTrue(car.hasFeature("Security System"));
        assertTrue(securitySystem.isActivated());
    }

    // Test for when no observers are attached
    @Test
    void testNoObservers() {
        BasicCar car = new BasicCar();
        car.addFeature("Audio System"); // Should not throw any exceptions
        assertTrue(true); // Placeholder, the test passes if no exception is thrown
    }

    // Test for detaching an observer
    @Test
    void testDetachObserver() {
        BasicCar car = new BasicCar();
        AudioSystem audioSystem = new AudioSystem();
        car.attach(audioSystem);
        car.detach(audioSystem);
        car.addFeature("Audio System"); 
        assertFalse(audioSystem.isInstalled()); // Audio system should not be installed
    }
}