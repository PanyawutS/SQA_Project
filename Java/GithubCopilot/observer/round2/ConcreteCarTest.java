package sqa_project.GithubCopilot.observer.round2;

import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;

public class ConcreteCarTest {
    @Test
    public void testAttachAndNotify() {
        ConcreteCar car = new ConcreteCar();
        CarFeature audio = new AudioSystem();
        CarFeature navigation = new NavigationSystem();
        CarFeature security = new SecuritySystem();

        car.attach(audio);
        car.attach(navigation);
        car.attach(security);

        car.notifyFeatures();
    }

    @Test
    public void testDetach() {
        ConcreteCar car = new ConcreteCar();
        CarFeature audio = new AudioSystem();
        CarFeature navigation = new NavigationSystem();
        CarFeature security = new SecuritySystem();

        car.attach(audio);
        car.attach(navigation);
        car.attach(security);

        car.detach(navigation);

        car.notifyFeatures();
    }
}