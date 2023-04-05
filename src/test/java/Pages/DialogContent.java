package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "ww")
    private WebElement ddd;


    public WebElement getWebElement(String strButton){

        switch (strButton){

          //  case "setup": return setup;

        }

        return null;
    }

}
