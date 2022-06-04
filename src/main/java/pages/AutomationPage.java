package pages;

import org.openqa.selenium.By;
import utils.Utilities;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.JavascriptExecutor;

public class AutomationPage extends Utilities {

    public void checkAutomationPage() {
        By pageTitle = By.xpath("//*[@id=\"intro-industries\"]/div/div/div/h1");
        Assert.assertNotNull(driver.findElement(pageTitle).getAttribute("innerText"));
    }
    public void scrollBottom() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        System.out.println("scrolled to end!");

    }
    public void footerPage() {

        By obssFooter = By.xpath("/html/body/div[4]/div/div/footer/div/div[6]");
        Assert.assertTrue(driver.findElement(obssFooter).isDisplayed());

    }
}