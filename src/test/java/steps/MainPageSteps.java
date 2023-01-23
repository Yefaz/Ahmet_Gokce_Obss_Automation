package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.MainPage;
import pages.Sorular;
import utils.Utilities;

public class MainPageSteps {
    MainPage mainPage =new MainPage();
    Utilities utilities =new Utilities();
    Sorular sorular =new Sorular();
    @Given("Kullanıcı girisi")
    public void kullaniciGiris() {
        mainPage.sendKeys("//*[@name='username']","witwises-admin");
        mainPage.sendKeys("//*[@name='password']","lLYVRayAHimpt9bJ");
        mainPage.clickButton("//*[text()='LOG IN']");




    }
    @When("Sessions_tanımlama")
    public void sessions_tanımlama() {
        mainPage.clickButton("//*[text()='Sessions']");
        mainPage.clickButton("//*[text()='Assign Session']");
        mainPage.clickButton("//*[@placeholder='Session Template Name']");
        mainPage.clickButton("//*[@name='TEST_AUTOMATIN_OTURUM_ŞABLONU']");
        mainPage.clickButton("(//*[@class='unstackable two fields']//*[@type='text'])[1]");
        mainPage.clickButton("//*[contains(text(),'23:30')]");
        mainPage.clickButton("(//*[@class='unstackable two fields']//*[@type='text'])[2]");
        mainPage.clickButton("//*[contains(text(),'23:50')]");
        mainPage.clickButton("//*[@name='assignmentType']");
        mainPage.clickButton("//*[@class='visible menu transition']//*[text()='Group Assignment']");
        mainPage.clickButton("//*[text()='Group Name']//..//..//..//..//*[@class='prompt']");
        mainPage.clickButton("//*[text()='TestAutomation 1001']");
    }

    @Then("Sessions atanması")
    public void sessionssAtanması() {
        mainPage.clickButton("//*[@class='ui modal transition visible active']//button[text()='Assign Session']");

    }
    @Given("Test Kullanıcısı girisi.")
    public void clickSearch(){
        mainPage.sendKeys("//*[@name='username']","AT_12445");
        mainPage.sendKeys("//*[@name='password']","AT_12445");
        mainPage.clickButton("//*[text()='LOG IN']");
        utilities.waitFor(3);
        mainPage.clickButton("//*[text()='Skip']");





    }
    @When("Teste basla.")
    public void teste_basla() {
        utilities.waitFor(3);
        mainPage.clickButton("(//*[text()='Ready to Start']//..//..//..//..//*[text()='Start Test'])[1]");
        mainPage.clickButton("//*[text()='Start the Test']");

        mainPage.clickButton("//*[text()='Test1']");
        utilities.waitFor(3);
        mainPage.clickButton("//*[@class='ui right floated image src-scenes-session-pages-test-SessionTest__icon']");

        utilities.waitFor(3);
        sorular.SoruCevapla(mainPage.SoruBaslik());
        utilities.waitFor(3);
        //    mainPage.sendKeys("//*[@class='ql-editor ql-blank']","Deneme");
        utilities.waitFor(3);
        mainPage.clickButton("(//*[@class='ui right floated image src-scenes-session-pages-test-SessionTest__icon'])[2]");
        utilities.waitFor(3);


        sorular.SoruCevapla(mainPage.SoruBaslik());
        utilities.waitFor(10);

        //   mainPage.clickButton("(//div[@class='ui radio checkbox src-common-components-Questions-Questions__listItem'])[3]");
        utilities.waitFor(5);
        mainPage.clickButton("(//*[@class='ui right floated image src-scenes-session-pages-test-SessionTest__icon'])[2]");
        utilities.waitFor(3);
        utilities.waitFor(3);
        mainPage.dragAndDropa("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[1]/div/span[1]/div", "//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/span[2]/span");
        utilities.waitFor(3);
        mainPage.dragAndDropa("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[1]/div/span[1]/div", "//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/span[4]/span");
        utilities.waitFor(2);
        mainPage.dragAndDropa("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[1]/div/span[1]/div", "//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/span[6]/span");
        utilities.waitFor(2);
        mainPage.dragAndDropa("//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[1]/div/span[1]/div", "//*[@id=\"root\"]/div[1]/div/div[3]/div/div[2]/div[3]/div[1]/div[2]/span[8]/span");

        ;
    }
    @Then("Testi bitir.")
    public void testi_bitir() {

        mainPage.clickButton("//*[@class='ui primary button src-scenes-session-pages-test-SessionTest__finishTestButton src-common-components-AssesmentButton-AssesmentButton__button']");
        utilities.waitFor(3);
        mainPage.clickButton("//*[text()='Finish Test']");
        utilities.waitFor(5);

    }


}
