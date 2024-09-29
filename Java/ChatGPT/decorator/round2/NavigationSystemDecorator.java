package sqa_project.ChatGPT.decorator.round2;

public class NavigationSystemDecorator extends CarDecorator {

    public NavigationSystemDecorator(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public String assemble() {
        return super.assemble() + ", Navigation System";
    }

    @Override
    public double cost() {
        return super.cost() + 2500.0;
    }
}
