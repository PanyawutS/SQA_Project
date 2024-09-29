package sqa_project.GeminiPro.decorator.round3;

public class AudioSystem extends CarDecorator {
    public AudioSystem(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Audio System";
    }

    @Override
    public double getCost() {
        return super.getCost() + 500;
    }
}