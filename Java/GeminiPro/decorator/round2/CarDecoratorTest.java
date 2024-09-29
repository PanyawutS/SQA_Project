package sqa_project.GeminiPro.decorator.round2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarDecoratorTest {

    @Test
    void testBasicCar() {
        Car car = new BasicCar();
        assertEquals("Basic Car", car.getDescription());
        assertEquals(20000, car.getPrice());
    }

    @Test
    void testCarWithAudioSystem() {
        Car car = new AudioSystem(new BasicCar());
        assertEquals("Basic Car, Audio System", car.getDescription());
        assertEquals(20500, car.getPrice());
    }

    @Test
    void testCarWithNavigationSystem() {
        Car car = new NavigationSystem(new BasicCar());
        assertEquals("Basic Car, Navigation System", car.getDescription());
        assertEquals(21000, car.getPrice());
    }

    @Test
    void testCarWithSecuritySystem() {
        Car car = new SecuritySystem(new BasicCar());
        assertEquals("Basic Car, Security System", car.getDescription());
        assertEquals(20800, car.getPrice());
    }

    @Test
    void testCarWithAllFeatures() {
        Car car = new SecuritySystem(new NavigationSystem(new AudioSystem(new BasicCar())));
        assertEquals("Basic Car, Audio System, Navigation System, Security System", car.getDescription());
        assertEquals(22300, car.getPrice());
    }

    // Additional test for adding features in different order
    @Test
    void testCarWithFeaturesDifferentOrder() {
        Car car = new AudioSystem(new SecuritySystem(new NavigationSystem(new BasicCar())));
        assertEquals("Basic Car, Navigation System, Security System, Audio System", car.getDescription());
        assertEquals(22300, car.getPrice());
    }
}