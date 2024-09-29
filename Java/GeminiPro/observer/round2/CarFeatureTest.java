package sqa_project.GeminiPro.observer.round2;

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
}