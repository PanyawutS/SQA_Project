package sqa_project.GeminiFlash.decorator.round1;

public class AudioSystemDecorator extends CarDecorator {
    public AudioSystemDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Audio System added.");
    }
}

