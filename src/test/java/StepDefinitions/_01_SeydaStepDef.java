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
import java.util.Optional;

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
    public void clickOnTheElementInSelectEmployeeName(DataTable items) {
        List<List<String>> dialogBtns = items.asLists(String.class);


        for (int i = 0; i < dialogBtns.size(); i++) {
            WebElement element = dc.getWebElement(dialogBtns.get(i).get(0));
            wait.until(ExpectedConditions.textToBePresentInElement(element,dialogBtns.get(i).get(1)));

            dc.clickFunction(element);

        }
    }

        @And("Click on the user role element in select")
        public void clickOnTheUserRoleElementInSelect(DataTable dt) {
            List<String> items = dt.asList(String.class);
            Actions actions = new Actions(GWD.getDriver());

            for (int i = 0; i < items.size(); i++) {
                WebElement element = dc.getWebElement(items.get(i));
                wait.until(ExpectedConditions.visibilityOf(element));
                Action action = actions.moveToElement(element).click().
                        keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).
                        keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).
                click().
                        keyDown(Keys.ENTER).keyUp(Keys.ENTER).build();
                action.perform();
                System.out.println(element.getText());
             //   dc.clickFunction(dc.getWebElement("userRoleSelectArrow"));

            }
        }

        @And("Click on the status element in select")
        public void clickOnTheStatusElementInSelect(DataTable dt) {
            List<String> items = dt.asList(String.class);
            Actions actions = new Actions(GWD.getDriver());

                for (int i = 0; i < items.size(); i++) {
                    WebElement element = dc.getWebElement(items.get(i));
                    wait.until(ExpectedConditions.visibilityOf(element));
                    Action action = actions.moveToElement(element).click().
                            keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).
                            click(). keyDown(Keys.ENTER).keyUp(Keys.ENTER).build();

                    action.perform();
                //     dc.clickFunction(dc.getWebElement("statusSelectArrow"));


            }
    }
}