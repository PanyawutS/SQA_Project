package sqa_project.GeminiPro.observer.round1;

public class AudioSystem implements CarObserver {
    private String featureUpdate;

    @Override
    public void update(String feature) {
        // Store the feature update received
        this.featureUpdate = "Audio System updated with: " + feature;
    }

    public String getFeatureUpdate() {
        return featureUpdate;
    }
}
