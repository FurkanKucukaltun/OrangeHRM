package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class _01_SeydaStepDef {

    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();
    @Given("I log in as an Admin")
    public void iLogInAsAnAdmin() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        GWD.getDriver().manage().window().maximize();

        dc.sendKeysFunction(dc.getWebElement("usernameLogin"),"Admin");
        dc.sendKeysFunction(dc.getWebElement("passwordLogin"),"admin123");
        dc.clickFunction(dc.getWebElement("loginBtn"));

    }

    @When("I navigate to Admin User Management page.")
    public void iNavigateToAdminUserManagementPage() {

    }

    @And("I click on Add button")
    public void iClickOnAddButton() {
    }
}
