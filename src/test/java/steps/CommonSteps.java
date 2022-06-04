package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import utils.Utilities;

import java.io.IOException;

public class CommonSteps extends Utilities {
    @Before
    public void startDriver() throws IOException {
        initialize();
    }

    @After
    public void terminateDriver() {
        terminate();
    }

    @Given("Navigate to {}")
    public void browserNavigate(String url) {
        navigate(url);
    }

    @Given("Wait for {}")
    public void browserNavigate(double duration) {
        waitFor(duration);
    }
}
