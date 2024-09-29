package sqa_project.GeminiPro.decorator.round2;

public class NavigationSystem extends CarDecorator {
    public NavigationSystem(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Navigation System";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1000;
    }
}