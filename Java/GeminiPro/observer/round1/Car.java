package sqa_project.GeminiPro.observer.round1;

public interface Car {
    void attach(CarObserver observer);
    void detach(CarObserver observer);
    void notifyObservers(String feature);
}