package sqa_project.GeminiFlash.observer.round3;

import java.util.List;

public interface Car {
    void addFeature(Feature feature);
    void removeFeature(Feature feature);
    void notifyObservers();
    List<Feature> getFeatures();
}
