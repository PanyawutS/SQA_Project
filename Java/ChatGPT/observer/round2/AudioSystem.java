package sqa_project.ChatGPT.observer.round2;

public class AudioSystem implements Observer {
    private String featureUpdate;

    @Override
    public void update(String featureUpdate) {
        this.featureUpdate = "Audio System: " + featureUpdate;
    }

    public String getFeatureUpdate() {
        return featureUpdate;
    }
}