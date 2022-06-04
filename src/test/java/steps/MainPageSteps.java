package steps;

import io.cucumber.java.en.Given;
import pages.MainPage;

public class MainPageSteps {
    MainPage mainPage =new MainPage();
    @Given("Kabul et")
    public void clickCookie() {
        mainPage.clickCookieButton();
    }
    @Given("Search Ikonuna Tıklanır.")
    public void clickSearch(){
        mainPage.clickSearchButton();
    }
    @Given("Text Alana Automation Yazılır.")
    public void write(){
        mainPage.writeAutomation();
    }
    @Given("Search Dogrulama.")
    public void result(){
        mainPage.checkResult();
    }
    @Given("Çıkan Sonuçlardan Ilkine Tıklanır.")
    public void resultFirst(){
        mainPage.clickFirst();
    }
}
