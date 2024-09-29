package sqa_project.GeminiPro.observer.round2;

public class SecuritySystem implements CarObserver {
    private boolean isActivated = false;

    @Override
    public void update(String feature) {
        if (feature.equalsIgnoreCase("Security System")) {
            isActivated = true;
            System.out.println("Security System installed and activated.");
        }
    }

    // Method to check if the Security System is activated
    public boolean isActivated() {
        return isActivated;
    }
}