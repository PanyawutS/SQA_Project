package sqa_project.ChatGPT.observer.round3;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<Observer> observers = new ArrayList<>();
    private String feature;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setFeature(String feature) {
        this.feature = feature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(feature);
        }
    }
}
