package sqa_project.ChatGPT.decorator.round1;

public class AudioSystemDecorator extends CarDecorator {

    public AudioSystemDecorator(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() + ", Audio System";
    }

    @Override
    public double cost() {
        return super.cost() + 1500.0;
    }
}

