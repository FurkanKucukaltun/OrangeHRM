package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class _02_FurkanStepDef {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    DialogContent dc=new DialogContent();

    @Then("Verify error message")
    public void verifyErrorMessage(DataTable items) {

        List<List<String>> dialogBtns = items.asLists(String.class);

        for (int i = 0; i < dialogBtns.size(); i++) {
            WebElement element = dc.getWebElement(dialogBtns.get(i).get(0));
            wait.until(ExpectedConditions.textToBePresentInElement(element,dialogBtns.get(i).get(1)));
            Assert.assertTrue(element.getText().equalsIgnoreCase(dialogBtns.get(i).get(1)));
        }
    }
}
