package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _01_SeydaStepDef {

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    DialogContent dc = new DialogContent();

    @Given("I log in as an Admin")
    public void iLogInAsAnAdmin() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
                GWD.getDriver().manage().window().maximize();

        dc.sendKeysFunction(dc.getWebElement("usernameLogin"), "Admin");
        dc.sendKeysFunction(dc.getWebElement("passwordLogin"), "admin123");
        dc.clickFunction(dc.getWebElement("loginBtn"));

    }

    @And("Click on the element in select Employee Name")
    public void clickOnTheElementInSelectEmployeeName(DataTable items) {
        List<List<String>> dialogBtns = items.asLists(String.class);


        for (int i = 0; i < dialogBtns.size(); i++) {
            WebElement element = dc.getWebElement(dialogBtns.get(i).get(0));
            wait.until(ExpectedConditions.textToBePresentInElement(element,dialogBtns.get(i).get(1)));

            dc.clickFunction(element);

        }
    }
}