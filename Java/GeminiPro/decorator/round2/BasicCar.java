package sqa_project.GeminiPro.decorator.round2;

public class BasicCar implements Car {
    @Override
    public String getDescription() {
        return "Basic Car";
    }

    @Override
    public double getPrice() {
        return 20000;
    }
}