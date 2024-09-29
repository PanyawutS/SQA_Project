package sqa_project.GeminiFlash.decorator.round1;

public class SecuritySystemDecorator extends CarDecorator {
    public SecuritySystemDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Security System added.");
    }
}