package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class _03_FarukStepDef {

    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    DialogContent dc=new DialogContent();
    @Then("Verify red color message")
    public void verifyRedColorMessage() {

    wait.until(ExpectedConditions.visibilityOf(dc.getWebElement("required")));
        Assert.assertTrue(dc.getWebElement("required").getText().equalsIgnoreCase("required"));
    }

    @Then("Verify Already Exists message")
    public void verifyAlreadyExistsMessageMessage() {
        wait.until(ExpectedConditions.visibilityOf(dc.getWebElement("alreadyExists")));
        Assert.assertTrue(dc.getWebElement("alreadyExists").getText().equalsIgnoreCase("Already exists"));
    }

    @Then("Verify 8 characters message")
    public void verifyCharactersMessage() {
        wait.until(ExpectedConditions.visibilityOf(dc.getWebElement("atLeastEightCharacters")));
        Assert.assertTrue(dc.getWebElement("atLeastEightCharacters").getText().equalsIgnoreCase("Should have at least 8 characters"));
    }
}
// "kırmızı renk" doğrulamasını yapamadım.