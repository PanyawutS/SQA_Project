package sqa_project.ChatGPT.observer.round3;

public class AudioSystem implements Observer {
    private String feature;

    @Override
    public void update(String feature) {
        this.feature = "Audio System: " + feature;
        System.out.println(this.feature);
    }

    public String getFeature() {
        return feature;
    }
}