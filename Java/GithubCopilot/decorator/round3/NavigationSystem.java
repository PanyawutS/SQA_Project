package sqa_project.GithubCopilot.decorator.round3;

public class NavigationSystem extends CarDecorator {
    public NavigationSystem(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription() + ", Navigation System";
    }

    @Override
    public double getCost() {
        return decoratedCar.getCost() + 2000;
    }
}