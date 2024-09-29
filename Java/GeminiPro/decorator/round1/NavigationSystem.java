package sqa_project.GeminiPro.decorator.round1;

public class NavigationSystem extends CarDecorator {
    public NavigationSystem(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Navigation System";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1000;
    }
}