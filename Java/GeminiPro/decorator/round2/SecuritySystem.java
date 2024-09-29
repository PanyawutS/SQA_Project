package sqa_project.GeminiPro.decorator.round2;

public class SecuritySystem extends CarDecorator {
    public SecuritySystem(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Security System";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 800;
    }
}