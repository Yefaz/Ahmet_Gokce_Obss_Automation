package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import utils.Utilities;

public class MainPage extends Utilities {

    public String SoruBaslik() {

        String text = null;
        By element = By.xpath("//*[@class='ql-editor src-common-components-RichLabel-RichLabel__richLabel false false src-common-components-Questions-Questions__title ']");
        text = driver.findElement(element).getText();


        return text;
    }


    public void clickCookieButton() {
        By cookieButton = By.id("cookieAcceptance");
        driver.findElement(cookieButton).click();
    }

    public void clickButton(String xpath) {
        By btn = By.xpath(xpath);
        driver.findElement(btn).click();
    }


    public void sendKeys(String xpath, String text) {
        By btn = By.xpath(xpath);
        driver.findElement(btn).sendKeys(text);
    }

    public void dragAndDropa(String xpath1, String xpath2) {
        By element1 = By.xpath(xpath1);
        WebElement from = driver.findElement(element1);
        By element2 = By.xpath(xpath2);
        WebElement to = driver.findElement(element2);
        Actions act = new Actions(driver);
        Action dragdrop = act.clickAndHold(from).moveToElement(to).release(to).build();
        act.perform();

        dragdrop.perform();


    }

    public void clickSearchButton() {
        By searchButton = By.id("search-icon");
        driver.findElement(searchButton).click();
    }


    public void writeAutomation() {
        By text = By.id("search-box");
        driver.findElement(text).sendKeys("Automation");
        driver.findElement(text).sendKeys(Keys.ENTER);
    }

    public void checkResult() {
        String urlHome = "https://obss.com.tr/en/?s=Automation";
        AssertJUnit.assertTrue(driver.getCurrentUrl().equalsIgnoreCase(urlHome));
    }

    public void clickFirst() {
        By firstResult = By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/article[1]/h2/a");
        driver.findElement(firstResult).click();
    }

}
