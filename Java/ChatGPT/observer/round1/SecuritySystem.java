package sqa_project.ChatGPT.observer.round1;

public class SecuritySystem implements Observer {
    private String featureUpdate;

    @Override
    public void update(String featureUpdate) {
        this.featureUpdate = "Security System updated with: " + featureUpdate;
        display();
    }

    public void display() {
        System.out.println(featureUpdate);
    }

    public String getFeatureUpdate() {
        return this.featureUpdate;
    }
}
