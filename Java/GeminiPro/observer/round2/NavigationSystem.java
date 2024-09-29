package sqa_project.GeminiPro.observer.round2;

public class NavigationSystem implements CarObserver {
    private boolean isInstalled = false;
    
    @Override
    public void update(String feature) {
        if (feature.equalsIgnoreCase("Navigation System")) {
            isInstalled = true;
            System.out.println("Navigation System installed and ready.");
        }
    }

    // Method to check if the Navigation System is installed
    public boolean isInstalled() {
        return isInstalled;
    }
}