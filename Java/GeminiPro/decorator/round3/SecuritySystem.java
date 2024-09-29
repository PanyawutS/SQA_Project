package sqa_project.GeminiPro.decorator.round3;


public class SecuritySystem extends CarDecorator {
    public SecuritySystem(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Security System";
    }

    @Override
    public double getCost() {
        return super.getCost() + 800;
    }
}