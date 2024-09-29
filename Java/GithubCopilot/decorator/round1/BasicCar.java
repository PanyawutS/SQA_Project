package sqa_project.GithubCopilot.decorator.round1;

public class BasicCar implements Car {
    @Override
    public String getDescription() {
        return "Basic Car";
    }

    @Override
    public double getCost() {
        return 20000;
    }
}