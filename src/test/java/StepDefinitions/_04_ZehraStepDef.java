package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _04_ZehraStepDef {

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    DialogContent dc = new DialogContent();



    @Then("Verify error message for confirm password")
    public void verifyErrorMessageForConfirmPassword() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[2]")));

        Assert.assertTrue(dc.getWebElement("confirmPasswordMsg").
                getText().equalsIgnoreCase("Passwords do not match"));

    }

}
