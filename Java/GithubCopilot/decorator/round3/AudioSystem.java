package sqa_project.GithubCopilot.decorator.round3;

public class AudioSystem extends CarDecorator {
    public AudioSystem(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription() + ", Audio System";
    }

    @Override
    public double getCost() {
        return decoratedCar.getCost() + 1500;
    }
}