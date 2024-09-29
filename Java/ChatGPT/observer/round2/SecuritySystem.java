package sqa_project.ChatGPT.observer.round2;

public class SecuritySystem implements Observer {
    private String featureUpdate;

    @Override
    public void update(String featureUpdate) {
        this.featureUpdate = "Security System: " + featureUpdate;
    }

    public String getFeatureUpdate() {
        return featureUpdate;
    }
}
