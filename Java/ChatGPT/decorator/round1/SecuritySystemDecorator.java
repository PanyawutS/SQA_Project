package sqa_project.ChatGPT.decorator.round1;

public class SecuritySystemDecorator extends CarDecorator {

    public SecuritySystemDecorator(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + ", Security System";
    }

    @Override
    public double cost() {
        return super.cost() + 3000.0;
    }
}
