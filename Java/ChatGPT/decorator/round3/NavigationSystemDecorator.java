package sqa_project.ChatGPT.decorator.round3;

public class NavigationSystemDecorator extends CarDecorator {

    public NavigationSystemDecorator(Car car) {
        super(car);
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
