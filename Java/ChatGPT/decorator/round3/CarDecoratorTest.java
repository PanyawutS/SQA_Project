package sqa_project.ChatGPT.decorator.round3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarDecoratorTest {

    @Test
    public void testBasicCar() {
        Car car = new BasicCar();
        assertEquals("Basic Car", car.assemble());
        assertEquals(20000.0, car.cost(), 0.01);
    }

    @Test
    public void testCarWithAudioSystem() {
        Car car = new AudioSystemDecorator(new BasicCar());
        assertEquals("Basic Car, Audio System", car.assemble());
        assertEquals(21500.0, car.cost(), 0.01);
    }

    @Test
    public void testCarWithNavigationSystem() {
        Car car = new NavigationSystemDecorator(new BasicCar());
        assertEquals("Basic Car, Navigation System", car.assemble());
        assertEquals(22500.0, car.cost(), 0.01);
    }

    @Test
    public void testCarWithSecuritySystem() {
        Car car = new SecuritySystemDecorator(new BasicCar());
        assertEquals("Basic Car, Security System", car.assemble());
        assertEquals(23000.0, car.cost(), 0.01);
    }

    @Test
    public void testCarWithAllFeatures() {
        Car car = new SecuritySystemDecorator(
                     new NavigationSystemDecorator(
                     new AudioSystemDecorator(
                     new BasicCar())));
        assertEquals("Basic Car, Audio System, Navigation System, Security System", car.assemble());
        assertEquals(27000.0, car.cost(), 0.01);
    }
}
