package sqa_project.GithubCopilot.observer.round1;

public interface Car {
    void attach(CarFeature feature);
    void detach(CarFeature feature);
    void notifyFeatures();
}