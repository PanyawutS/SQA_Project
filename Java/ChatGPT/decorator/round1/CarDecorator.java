package sqa_project.ChatGPT.decorator.round1;

public abstract class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String assemble() {
        return car.assemble();
    }

    @Override
    public double cost() {
        return car.cost();
    }
}

