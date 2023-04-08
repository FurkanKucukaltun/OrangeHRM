package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _01_SeydaStepDef {

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @Given("I log in as an Admin")
    public void iLogInAsAnAdmin() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
                GWD.getDriver().manage().window().maximize();

        dc.sendKeysFunction(dc.getWebElement("usernameLogin"), "Admin");
        dc.sendKeysFunction(dc.getWebElement("passwordLogin"), "admin123");
        dc.clickFunction(dc.getWebElement("loginBtn"));

    }



    @And("Click on the element in select Employee Name")
    public void clickOnTheElementInSelect(DataTable items) {
        List<String> dialogBtns=items.asList(String.class);
        for (String dialogBtn: dialogBtns) {
            List<WebElement> element = dc.getWebElementList(dialogBtn);
         //   wait.until(ExpectedConditions.textToBePresentInElement(element, "Odis Adalwin"));
            wait.until(ExpectedConditions.numberOfElementsToBeMoreThan((By)element, 1));

            dc.clickFunction(element.get(2));

        }}

    @And("User sending the keys in Employee Name")
    public void userSendingTheKeysInEmployeeName(DataTable dt) {

        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element, items.get(i).get(1));
        }


    }

}