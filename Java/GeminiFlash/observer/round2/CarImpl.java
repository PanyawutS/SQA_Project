package sqa_project.GeminiFlash.observer.round2;

import java.util.ArrayList;
import java.util.List;

public class CarImpl implements Car {
    private final List<Feature> features = new ArrayList<>();

    @Override
    public void addFeature(Feature feature) {
        features.add(feature);
        notifyObservers();
    }
    @Override
    public List<Feature> getFeatures() {
        return features;
    }

    @Override
    public void removeFeature(Feature feature) {
        features.remove(feature);
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Feature feature : features) {
            feature.update(this);
        }
    }
}
