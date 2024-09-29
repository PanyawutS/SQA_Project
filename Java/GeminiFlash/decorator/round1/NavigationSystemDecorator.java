package sqa_project.GeminiFlash.decorator.round1;

public class NavigationSystemDecorator extends CarDecorator {
	public NavigationSystemDecorator(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Navigation System added.");
	}
}