package sqa_project.GeminiPro.decorator.round3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarDecoratorTest {

    @Test
    void testBasicCar() {
        Car car = new BasicCar();
        assertEquals("Basic Car", car.getDescription());
        assertEquals(20000, car.getCost());
    }

    @Test
    void testCarWithAudioSystem() {
        Car car = new AudioSystem(new BasicCar());
        assertEquals("Basic Car, Audio System", car.getDescription());
        assertEquals(20500, car.getCost());
    }

    @Test
    void testCarWithNavigationSystem() {
        Car car = new NavigationSystem(new BasicCar());
        assertEquals("Basic Car, Navigation System", car.getDescription());
        assertEquals(21000, car.getCost());
    }

    @Test
    void testCarWithSecuritySystem() {
        Car car = new SecuritySystem(new BasicCar());
        assertEquals("Basic Car, Security System", car.getDescription());
        assertEquals(20800, car.getCost());
    }

    @Test
    void testCarWithAllFeatures() {
        Car car = new SecuritySystem(new NavigationSystem(new AudioSystem(new BasicCar())));
        assertEquals("Basic Car, Audio System, Navigation System, Security System", car.getDescription());
        assertEquals(22300, car.getCost());
    }
}
