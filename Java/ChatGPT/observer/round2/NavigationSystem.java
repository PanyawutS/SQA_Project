package sqa_project.ChatGPT.observer.round2;

public class NavigationSystem implements Observer {
    private String featureUpdate;

    @Override
    public void update(String featureUpdate) {
        this.featureUpdate = "Navigation System: " + featureUpdate;
    }

    public String getFeatureUpdate() {
        return featureUpdate;
    }
}