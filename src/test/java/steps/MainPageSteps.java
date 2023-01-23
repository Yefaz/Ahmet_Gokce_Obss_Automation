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





        //*[text()='TestAutomation 1001']

        //*[@class='visible menu transition']//*[text()='Group Assignment']

        //*[@name='assignmentType']
       // (//*[@class='unstackable two fields']//*[@type='text'])[1]

       //    (//*[@name='radioGroup'])[4]
        //*[contains(text(),'20')]
        //*[@class='ql-editor']
       // (//*[@class='ui right floated image src-scenes-session-pages-test-SessionTest__icon'])[2]
       // mainPage.clickCookieButton();
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
    @Given("Search Ikonuna Tıklanır.")
    public void clickSearch(){
        mainPage.sendKeys("//*[@name='username']","AT_12440");
        mainPage.sendKeys("//*[@name='password']","AT_12440");
        mainPage.clickButton("//*[text()='LOG IN']");
        mainPage.clickButton("//*[text()='Skip']");
        utilities.waitFor(5);
        mainPage.clickButton("(//*[text()='Ready to Start']//..//..//..//..//*[text()='Start Test'])[1]");
        mainPage.clickButton("//*[text()='Start the Test']");

        mainPage.clickButton("//*[text()='Test1']");
        utilities.waitFor(5);
        mainPage.clickButton("//*[@class='ui right floated image src-scenes-session-pages-test-SessionTest__icon']");


        sorular.SoruCevapla(mainPage.SoruBaslik());
    //    mainPage.sendKeys("//*[@class='ql-editor ql-blank']","Deneme");
        utilities.waitFor(5);
        mainPage.clickButton("(//*[@class='ui right floated image src-scenes-session-pages-test-SessionTest__icon'])[2]");



        sorular.SoruCevapla(mainPage.SoruBaslik());

     //   mainPage.clickButton("(//div[@class='ui radio checkbox src-common-components-Questions-Questions__listItem'])[3]");
        utilities.waitFor(5);
        mainPage.clickButton("(//*[@class='ui right floated image src-scenes-session-pages-test-SessionTest__icon'])[2]");

        utilities.waitFor(5);
        mainPage.dragAndDrop("(//span[@class='src-common-components-Questions-DragAndDrop-QuestionPreview__placeholder'])[1]']", "(//div[@class='ui medium label src-common-components-Questions-DragAndDrop-BlankItem__blankLabel'])[4]");
        utilities.waitFor(5);
        mainPage.dragAndDrop("(//span[@class='src-common-components-Questions-DragAndDrop-QuestionPreview__placeholder'])[2]']", "(//div[@class='ui medium label src-common-components-Questions-DragAndDrop-BlankItem__blankLabel'])[2]");
        utilities.waitFor(5);
        mainPage.dragAndDrop("(//span[@class='src-common-components-Questions-DragAndDrop-QuestionPreview__placeholder'])[3]']", "(//div[@class='ui medium label src-common-components-Questions-DragAndDrop-BlankItem__blankLabel'])[5]");
        utilities.waitFor(5);
        mainPage.dragAndDrop("(//span[@class='src-common-components-Questions-DragAndDrop-QuestionPreview__placeholder'])[4]']", "(//div[@class='ui medium label src-common-components-Questions-DragAndDrop-BlankItem__blankLabel'])[1]");
        utilities.waitFor(5);

        mainPage.clickButton("//*[@class='ui primary button src-scenes-session-pages-test-SessionTest__finishTestButton src-common-components-AssesmentButton-AssesmentButton__button']");


    }


}
