package sqa_project.ChatGPT.decorator.round2;

public abstract class CarDecorator implements Car {
    protected Car decoratedCar;

    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public String assemble() {
        return decoratedCar.assemble();
    }

    @Override
    public double cost() {
        return decoratedCar.cost();
    }
}

