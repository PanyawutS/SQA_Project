package sqa_project.GeminiPro.observer.round3;

public interface Car {
    void attach(CarObserver observer);
    void detach(CarObserver observer);
    void notifyObservers(String feature);
}