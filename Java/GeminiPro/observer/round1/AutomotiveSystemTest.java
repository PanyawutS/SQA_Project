package sqa_project.GeminiPro.observer.round1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class AutomotiveSystemTest {

    @Test
    public void testObserverPattern() {
        Subject car = new Subject();

        AudioSystem audio = new AudioSystem();
        NavigationSystem navigation = new NavigationSystem();
        SecuritySystem security = new SecuritySystem();

        // Add observers
        car.addObserver(audio);
        car.addObserver(navigation);
        car.addObserver(security);

        // Test initial update
        car.setFeatureUpdate("Bluetooth connectivity");
        assertEquals("Audio System updated with: Bluetooth connectivity", audio.getFeatureUpdate());
        assertEquals("Navigation System updated with: Bluetooth connectivity", navigation.getFeatureUpdate());
        assertEquals("Security System updated with: Bluetooth connectivity", security.getFeatureUpdate());

        // Remove an observer and update again
        car.removeObserver(security);
        car.setFeatureUpdate("GPS tracking");
        assertEquals("Audio System updated with: GPS tracking", audio.getFeatureUpdate());
        assertEquals("Navigation System updated with: GPS tracking", navigation.getFeatureUpdate());
        assertNull(security.getFeatureUpdate(), "Security System should not receive updates after being removed");
    }
}
