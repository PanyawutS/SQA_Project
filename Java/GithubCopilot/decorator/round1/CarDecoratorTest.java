package sqa_project.GithubCopilot.decorator.round1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CarDecoratorTest {

    @Test
    public void testBasicCar() {
        Car car = new BasicCar();
        assertEquals("Basic Car", car.getDescription());
        assertEquals(20000, car.getCost());
    }

    @Test
    public void testCarWithAudioSystem() {
        Car car = new AudioSystem(new BasicCar());
        assertEquals("Basic Car, Audio System", car.getDescription());
        assertEquals(21500, car.getCost());
    }

    @Test
    public void testCarWithNavigationSystem() {
        Car car = new NavigationSystem(new BasicCar());
        assertEquals("Basic Car, Navigation System", car.getDescription());
        assertEquals(22000, car.getCost());
    }

    @Test
    public void testCarWithSecuritySystem() {
        Car car = new SecuritySystem(new BasicCar());
        assertEquals("Basic Car, Security System", car.getDescription());
        assertEquals(22500, car.getCost());
    }

    @Test
    public void testCarWithAllFeatures() {
        Car car = new SecuritySystem(new NavigationSystem(new AudioSystem(new BasicCar())));
        assertEquals("Basic Car, Audio System, Navigation System, Security System", car.getDescription());
        assertEquals(26000, car.getCost());
    }
}