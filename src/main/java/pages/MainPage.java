package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.Utilities;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class MainPage extends Utilities {

    public void clickCookieButton(){
        By cookieButton = By.id("cookieAcceptance");
        driver.findElement(cookieButton).click();
    }

    public void clickSearchButton(){
        By searchButton = By.id("search-icon");
        driver.findElement(searchButton).click();
    }
    public void writeAutomation(){
        By text = By.id("search-box");
        driver.findElement(text).sendKeys("Automation");
        driver.findElement(text).sendKeys(Keys.ENTER);
    }
    public void checkResult(){
        String urlHome = "https://obss.com.tr/en/?s=Automation";
        AssertJUnit.assertTrue(driver.getCurrentUrl().equalsIgnoreCase(urlHome));
    }
    public void clickFirst(){
        By firstResult = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/article[1]/h2/a");
        driver.findElement(firstResult).click();
    }

    // dneme deneme

}
