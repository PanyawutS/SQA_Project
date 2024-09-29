package sqa_project.GeminiPro.observer.round2;

public class AudioSystem implements CarObserver {
    private boolean isInstalled = false;

    @Override
    public void update(String feature) {
        if (feature.equalsIgnoreCase("Audio System")) {
            isInstalled = true;
            System.out.println("Audio System installed and ready.");
        }
    }

    // Method to check if the Audio System is installed
    public boolean isInstalled() {
        return isInstalled;
    }
}
