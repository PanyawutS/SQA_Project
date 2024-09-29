package sqa_project.ChatGPT.decorator.round1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testBasicCar() {
        Car basicCar = new BasicCar();
        assertEquals("Basic Car", basicCar.assemble());
        assertEquals(20000.0, basicCar.cost(), 0.01);
    }

    @Test
    public void testCarWithAudioSystem() {
        Car audioCar = new AudioSystemDecorator(new BasicCar());
        assertEquals("Basic Car, Audio System", audioCar.assemble());
        assertEquals(21500.0, audioCar.cost(), 0.01);
    }

    @Test
    public void testCarWithNavigationSystem() {
        Car navigationCar = new NavigationSystemDecorator(new BasicCar());
        assertEquals("Basic Car, Navigation System", navigationCar.assemble());
        assertEquals(22500.0, navigationCar.cost(), 0.01);
    }

    @Test
    public void testCarWithSecuritySystem() {
        Car securityCar = new SecuritySystemDecorator(new BasicCar());
        assertEquals("Basic Car, Security System", securityCar.assemble());
        assertEquals(23000.0, securityCar.cost(), 0.01);
    }

    @Test
    public void testCarWithAllFeatures() {
        Car fullyLoadedCar = new SecuritySystemDecorator(
                                new NavigationSystemDecorator(
                                new AudioSystemDecorator(
                                new BasicCar())));
        assertEquals("Basic Car, Audio System, Navigation System, Security System", fullyLoadedCar.assemble());
        assertEquals(27000.0, fullyLoadedCar.cost(), 0.01);
    }
}

