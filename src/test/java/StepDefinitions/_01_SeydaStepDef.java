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

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @Given("I log in as an Admin")
    public void iLogInAsAnAdmin() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login%22");
                GWD.getDriver().manage().window().maximize();

        dc.sendKeysFunction(dc.getWebElement("usernameLogin"), "Admin");
        dc.sendKeysFunction(dc.getWebElement("passwordLogin"), "admin123");
        dc.clickFunction(dc.getWebElement("loginBtn"));

    }



    @And("Click on the element in select")
    public void clickOnTheElementInSelect(DataTable items) {
        List<String> dialogBtns=items.asList(String.class);
        for (String dialogBtn: dialogBtns) {
            WebElement element = dc.getWebElement(dialogBtn);
            wait.until(ExpectedConditions.textToBePresentInElement(element, "Odis Adalwin"));
            dc.clickFunction(element);

        }}

    @And("User sending the keys in Employee Name")
    public void userSendingTheKeysInEmployeeName(DataTable dt) {

        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element, items.get(i).get(1));
            //  wait.until(ExpectedConditions.textToBe((By) dc.getWebElement("employeeNameList"),"Odis  Adalwin"));
            System.out.println(dc.getWebElement("employeeNameList"));
            //         dc.clickFunction(dc.getWebElementList("employeeNameList").get(0));

        }



    }

}