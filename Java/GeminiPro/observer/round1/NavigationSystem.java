package sqa_project.GeminiPro.observer.round1;

public class NavigationSystem implements CarObserver {
    private String featureUpdate;

    @Override
    public void update(String feature) {
        // Store the feature update received
        this.featureUpdate = "Navigation System updated with: " + feature;
    }

    public String getFeatureUpdate() {
        return featureUpdate;
    }
}
