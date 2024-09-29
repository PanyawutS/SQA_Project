package sqa_project.GeminiPro.decorator.round2;

public class AudioSystem extends CarDecorator {
    public AudioSystem(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Audio System";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 500;
    }
}