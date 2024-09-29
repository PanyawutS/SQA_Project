package sqa_project.GeminiPro.observer.round2;

import java.util.ArrayList;
import java.util.List;

public class BasicCar implements Car {
    private final List<CarObserver> observers = new ArrayList<>();
    private final List<String> installedFeatures = new ArrayList<>();

    @Override
    public void attach(CarObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(CarObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String feature) {
        for (CarObserver observer : observers) {
            observer.update(feature);
        }
    }

    public void addFeature(String feature) {
        System.out.println("Adding feature: " + feature);
        installedFeatures.add(feature);
        notifyObservers(feature);
    }

    // Method to check if a feature is installed
    public boolean hasFeature(String feature) {
        return installedFeatures.contains(feature);
    }
}