package sqa_project.GeminiPro.observer.round1;

import java.util.ArrayList;
import java.util.List;


public class Subject {
    private final List<CarObserver> observers = new ArrayList<>();
    private String featureUpdate;

    // Method to add an observer
    public void addObserver(CarObserver observer) {
        observers.add(observer);
    }

    // Method to remove an observer
    public void removeObserver(CarObserver observer) {
        observers.remove(observer);
    }

    // Method to set feature update and notify all observers
    public void setFeatureUpdate(String featureUpdate) {
        this.featureUpdate = featureUpdate;
        notifyAllObservers();
    }

    // Method to notify all observers of a feature update
    private void notifyAllObservers() {
        for (CarObserver observer : observers) {
            observer.update(featureUpdate);
        }
    }
}

