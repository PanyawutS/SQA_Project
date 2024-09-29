package sqa_project.ChatGPT.observer.round2;

import java.util.ArrayList;
import java.util.List;

public class Car {
	private List<Observer> observers = new ArrayList<>();
	private String featureUpdate;

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(featureUpdate);
		}
	}

	public void setFeatureUpdate(String featureUpdate) {
		this.featureUpdate = featureUpdate;
		notifyObservers();
	}
}
