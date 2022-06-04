package utils;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Driver {

    public static WebDriver driver;

    public void initialize() throws IOException {
        driver = DriverFactory.getDriver("chrome", driver);
    }

    public void terminate() {
        driver.quit();
    }


}
