package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _02_FurkanStepDef {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    DialogContent dc=new DialogContent();
    @Then("Verify error message")
    public void verifyErrorMessage() {


        Assert.assertTrue(dc.getWebElement("errorMsg").getText().equalsIgnoreCase("Should be at least 5 characters"));

    }

    @Then("Verify Add User heading")
    public void verifyAddUserHeading() {
        wait.until(ExpectedConditions.visibilityOf(dc.getWebElement("AddUserHeading")));
        Assert.assertTrue(dc.getWebElement("AddUserHeading").getText().equalsIgnoreCase("Add User"));
    }
}
