package sqa_project.ChatGPT.observer.round3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

	@Test
	public void testAddingFeatures() {
		Car car = new Car();

		AudioSystem audioSystem = new AudioSystem();
		NavigationSystem navigationSystem = new NavigationSystem();
		SecuritySystem securitySystem = new SecuritySystem();

		car.addObserver(audioSystem);
		car.addObserver(navigationSystem);
		car.addObserver(securitySystem);

		car.setFeature("Bluetooth enabled");

		assertEquals("Audio System: Bluetooth enabled", audioSystem.getFeature());
		assertEquals("Navigation System: Bluetooth enabled", navigationSystem.getFeature());
		assertEquals("Security System: Bluetooth enabled", securitySystem.getFeature());
	}

	@Test
	public void testRemovingFeature() {
		Car car = new Car();

		AudioSystem audioSystem = new AudioSystem();
		NavigationSystem navigationSystem = new NavigationSystem();
		SecuritySystem securitySystem = new SecuritySystem();

		car.addObserver(audioSystem);
		car.addObserver(navigationSystem);
		car.addObserver(securitySystem);

		car.setFeature("GPS tracking enabled");

		assertEquals("Audio System: GPS tracking enabled", audioSystem.getFeature());
		assertEquals("Navigation System: GPS tracking enabled", navigationSystem.getFeature());
		assertEquals("Security System: GPS tracking enabled", securitySystem.getFeature());

		// Remove NavigationSystem and update again
		car.removeObserver(navigationSystem);
		car.setFeature("Anti-theft system enabled");

		assertEquals("Audio System: Anti-theft system enabled", audioSystem.getFeature());
		assertEquals("Security System: Anti-theft system enabled", securitySystem.getFeature());
		assertEquals("Navigation System: GPS tracking enabled", navigationSystem.getFeature()); // No update after
																								// removal
	}
}
