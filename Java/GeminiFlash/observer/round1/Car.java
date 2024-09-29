package sqa_project.GeminiFlash.observer.round1;

import java.util.List;

public interface Car {
    void addFeature(Feature feature);
    void removeFeature(Feature feature);
    void notifyObservers();
    // Add this method if Car is an interface
    List<Feature> getFeatures();
    
}
