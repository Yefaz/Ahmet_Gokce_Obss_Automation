package steps;

import io.cucumber.java.en.Given;
import pages.AutomationPage;

public class AutomationPageStep {

AutomationPage automationPage = new AutomationPage();

  @Given("Testing & Automation Sayfasının Açıldığı Doğrulanır.")

    public void checkAutomation (){

      automationPage.checkAutomationPage();
  }
  @Given("Sayfanın En Altına Gidilir.")

  public void scroll (){

    automationPage.scrollBottom();
  }
  @Given("Obss Footer' ının Geldiği Doğrulanır.")

  public void footer (){

    automationPage.footerPage();
  }
}
