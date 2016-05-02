package edu.mermet;

import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void monTest() {
	new App();
	App.main();
	assertTrue(true);
    }

    @Test
    public void monTestEchoue() {
	assertFalse(false);
    }
}
