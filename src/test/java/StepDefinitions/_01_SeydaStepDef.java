package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _01_SeydaStepDef {

    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
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

    @And("User sending the keys in Employee Name")
    public void userSendingTheKeysInEmployeeName(DataTable dt) {

        Actions aksiyonlar= new Actions(GWD.getDriver());
        List<List<String>> items=dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element,items.get(i).get(1));
            wait.until(ExpectedConditions.visibilityOf(dc.getWebElement(items.get(i).get(0))));
            Action aksiyon= aksiyonlar
                    .moveToElement(element)
                    .click()
                    .keyDown(Keys.ARROW_DOWN)
                    .keyUp(Keys.ARROW_DOWN)
                    .keyDown(Keys.ARROW_DOWN)
                    .keyUp(Keys.ARROW_DOWN)
                    .keyDown(Keys.ENTER)
                    .keyUp(Keys.ENTER)
                    .build();
            aksiyon.perform();
        }
    }
}
