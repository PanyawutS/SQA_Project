package sqa_project.GeminiFlash.decorator.round3;

import org.junit.jupiter.api.Test;

// import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarDecoratorTest {

	@Test
	void testBasicCar() {
		Car car = new BasicCar();
		car.assemble();
		// Expected output: Basic Car assembled.
	}

	@Test
	void testAudioSystemDecorator() {
		Car car = new AudioSystemDecorator(new BasicCar());
		car.assemble();
		// Expected output: Basic Car assembled.
		// Audio System added.
	}

	@Test
	void testNavigationSystemDecorator() {
		Car car = new NavigationSystemDecorator(new BasicCar());
		car.assemble();
		// Expected output: Basic Car assembled.
		// Navigation System added.
	}

	@Test
	void testSecuritySystemDecorator() {
		Car car = new SecuritySystemDecorator(new BasicCar());
		car.assemble();
		// Expected output: Basic Car assembled.
		// Security System added.
	}

	@Test
	void testMultipleDecorators() {
		Car car = new SecuritySystemDecorator(new NavigationSystemDecorator(new AudioSystemDecorator(new BasicCar())));
		car.assemble();
		// Expected output: Basic Car assembled.
		// Audio System added.
		// Navigation System added.
		// Security System added.
	}
}
