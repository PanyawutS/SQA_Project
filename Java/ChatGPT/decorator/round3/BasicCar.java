package sqa_project.ChatGPT.decorator.round3;

public class BasicCar implements Car {

    @Override
    public String assemble() {
        return "Basic Car";
    }

    @Override
    public double cost() {
        return 20000.0; // Base price of the car
    }
}

