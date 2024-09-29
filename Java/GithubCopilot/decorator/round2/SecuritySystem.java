package sqa_project.GithubCopilot.decorator.round2;

public class SecuritySystem extends CarDecorator {
    public SecuritySystem(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription() + ", Security System";
    }

    @Override
    public double getCost() {
        return decoratedCar.getCost() + 2500;
    }
}