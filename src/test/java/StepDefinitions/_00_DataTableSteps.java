package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class _00_DataTableSteps {
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Click on the element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable items) {
        List<String> strButtons = items.asList(String.class);

        for(String strButton:strButtons){
            WebElement element=ln.getWebElement(strButton); // Webelementi getir
            ln.clickFunction(element); // Webelemente tıklat
        }


    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable items) {
        List<String> dialogBtns=items.asList(String.class);
        for (String dialogBtn: dialogBtns) {
            WebElement element = dc.getWebElement(dialogBtn);
            wait.until(ExpectedConditions.visibilityOf(dc.getWebElement(dialogBtn)));
            dc.clickFunction(element);
        }

    }



    @And("Select on the element in Dialog")
    public void selectOnTheElementInDialog(DataTable dt) {
        List<List<String>> items=dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.selectFunction(element,items.get(i).get(1));
        }

    }

    @And("User sending the keys in Dialog Content")
    public void userSendingTheKeysInDialogContent(DataTable dt) {
        List<List<String>> items=dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element,items.get(i).get(1));
        }

    }

    @Then("Verify contains text")
    public void verifyContainsText(DataTable dt) {
        List<List<String>> items=dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.verifyContainsTextFunction(element,items.get(i).get(1));
        }


    }



//Delete için eklenecek
//    @And("User delete item from Dialog Content")
//    public void userDeleteItemFromDialogContent(DataTable dt) {
//        List<String> dialogBtns=dt.asList(String.class);
//
//        for (String strDeleteText: dialogBtns) {
//            dc.deleteItem(strDeleteText);
//        }
//    }
}
