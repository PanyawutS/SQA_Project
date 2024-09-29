package sqa_project.ChatGPT.observer.round1;

public class AudioSystem implements Observer {
    private String featureUpdate;

    @Override
    public void update(String featureUpdate) {
        this.featureUpdate = "Audio System updated with: " + featureUpdate;
        display();
    }

    public String getFeatureUpdate() {
        return this.featureUpdate;
    }
    
    public void display() {
        System.out.println(featureUpdate);
    }
}
