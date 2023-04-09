package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _12_ZehraStepDef {

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    DialogContent dc=new DialogContent();

    @Then("Verify error message for password characters")
    public void verifyErrorMessageForPasswordCharacters() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")));

        Assert.assertTrue(dc.getWebElement("passwordChr").getText().
 equalsIgnoreCase("Your password must contain a lower-case letter, an upper-case letter, a digit and a special character. Try a different password"));
        // contains("Your password must contain a lower-case letter");
       // System.out.println("Try a different password");

    }
}
