package edu.mermet;

import org.junit.*;
import static org.junit.Assert.*;

public class AppIT {
    @Test
    public void monTestIT() {
	new App();
	App.main();
	assertTrue(true);
    }

    @Test
    public void monTestEchoueIT() {
	assertFalse(false);
    }
}
