package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _08_ZehraStepDef {

    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    DialogContent dc = new DialogContent();


    @Then("Verify add button")
    public void verifyAddButton() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//i[@class='oxd-icon bi-plus oxd-button-icon']")));

        Assert.assertTrue(dc.getWebElement("addBtnVerify").getText().
                equalsIgnoreCase("Add"));
    }
}
