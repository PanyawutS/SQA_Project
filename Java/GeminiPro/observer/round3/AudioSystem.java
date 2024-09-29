package sqa_project.GeminiPro.observer.round3;

public class AudioSystem implements CarObserver {
    private boolean isInstalled = false;

    @Override
    public void update(Car car, String feature) {
        if (feature.equalsIgnoreCase("Audio System") && car instanceof BasicCar) { 
            isInstalled = true;
            System.out.println("Audio System installed and ready.");
        }
    }

    // Method to check if the Audio System is installed
    public boolean isInstalled() {
        return isInstalled;
    }
}