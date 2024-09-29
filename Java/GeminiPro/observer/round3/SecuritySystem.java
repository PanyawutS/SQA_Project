package sqa_project.GeminiPro.observer.round3;

public class SecuritySystem implements CarObserver {
    private boolean isActivated = false;

    @Override
    public void update(Car car, String feature) {
        if (feature.equalsIgnoreCase("Security System") && car instanceof BasicCar) {
            isActivated = true;
            System.out.println("Security System installed and activated.");
        }
    }

    // Method to check if the Security System is activated
    public boolean isActivated() {
        return isActivated;
    }
}