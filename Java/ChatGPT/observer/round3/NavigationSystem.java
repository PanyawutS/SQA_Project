package sqa_project.ChatGPT.observer.round3;

public class NavigationSystem implements Observer {
    private String feature;

    @Override
    public void update(String feature) {
        this.feature = "Navigation System: " + feature;
        System.out.println(this.feature);
    }

    public String getFeature() {
        return feature;
    }
}