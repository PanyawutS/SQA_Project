package sqa_project.GithubCopilot.observer.round2;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCar implements Car {
    private List<CarFeature> features = new ArrayList<>();

    @Override
    public void attach(CarFeature feature) {
        features.add(feature);
    }

    @Override
    public void detach(CarFeature feature) {
        features.remove(feature);
    }

    @Override
    public void notifyFeatures() {
        for (CarFeature feature : features) {
            feature.update();
        }
    }
}