package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.Utilities;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.interactions.Actions;
public class Sorular extends Utilities {
MainPage mainPage=new MainPage();

    Utilities utilities=new Utilities();
    public void SoruCevapla(String SoruBasligi) {


        if(SoruBasligi.equals("Test "))
        { mainPage.clickButton("//*[text()='Test1']");}
        else if(SoruBasligi.equals("Aşağıdakilerden hangisi fonksiyonel olmayan test türlerinden birisidir?"))
        { mainPage.clickButton("//*[text()='Test3']");}
        else if(SoruBasligi.equals("Test nedir?"))
        { mainPage.sendKeys("//*[@class='ql-editor ql-blank']","Deneme");}
        else if(SoruBasligi.equals("Drop the correct answer by dragging the options into the 4 space below.")) {
            utilities.waitFor(3);
            mainPage.dragAndDropa("(//span[@class='src-common-components-Questions-DragAndDrop-QuestionPreview__placeholder'])[1]']", "(//div[@class='ui medium label src-common-components-Questions-DragAndDrop-BlankItem__blankLabel'])[4]");
            utilities.waitFor(3);
            mainPage.dragAndDropa("//*[text()='Test2']", "(//*[@class='src-common-components-Questions-DragAndDrop-QuestionPreview__placeholder'])[2]");
            utilities.waitFor(3);
            mainPage.dragAndDropa("//*[text()='Test3']", "(//*[@class='src-common-components-Questions-DragAndDrop-QuestionPreview__placeholder'])[3]");
            utilities.waitFor(3);
            mainPage.dragAndDropa("//*[text()='Test4']", "(//*[@class='src-common-components-Questions-DragAndDrop-QuestionPreview__placeholder'])[4]");
            utilities.waitFor(5);
        }
    }
}