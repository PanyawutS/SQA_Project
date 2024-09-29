package sqa_project.GeminiFlash.observer.round3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

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

	@Test
	public void testAddAndRemoveFeature() {
		Car car = new CarImpl();
		AudioSystem audioSystem = new AudioSystem();
		NavigationSystem navigationSystem = new NavigationSystem();

		car.addFeature(audioSystem);
		car.addFeature(navigationSystem);

		// Remove Audio System
		car.removeFeature(audioSystem);

		// Verify Audio System is removed
		assertTrue(car.getFeatures().contains(navigationSystem));
		assertTrue(!car.getFeatures().contains(audioSystem));
	}

	@Test
	public void testRemoveNonExistingFeature() {
		Car car = new CarImpl();
		AudioSystem audioSystem = new AudioSystem();

		// Remove a non-existing feature
		car.removeFeature(audioSystem);

		// Verify that the feature list remains unchanged
		assertTrue(car.getFeatures().isEmpty());
	}

	@Test
	public void testNotifyObserversWithEmptyFeaturesList() {
		Car car = new CarImpl();

		// Trigger notification with empty features list
		car.notifyObservers();
	}
}