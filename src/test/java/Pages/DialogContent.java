package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement usernameLogin;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordLogin;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[text()=' Add ']")
    private WebElement addBtn;

    @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
    private WebElement userRoleSelect;//div[@class='oxd-select-text oxd-select-text--active'])[1]

    @FindBy(xpath = "(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    private WebElement userRoleSelectArrow;

    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
    private WebElement statusSelect;

    @FindBy(xpath = "(//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    private WebElement statusSelectArrow;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement employeeName;

    @FindBy(xpath = "//div[@role='listbox']")
    private WebElement employeeNameList;  //div[@class='oxd-autocomplete-text-input--after']

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement userName;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    private WebElement password;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    private WebElement confirmPassword;

    @FindBy(xpath = "//button[text()=' Save ']")
    private WebElement saveBtn;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    private WebElement invalidMsg;

    @FindBy(xpath = "//*[text()='Success']") // locator kontrol et
    private WebElement successMsg;



    @FindBy(xpath = "(//button[@type='button'])[2]")
    private WebElement cancel;
//
//    @FindBy(xpath = "")
//    private WebElement ;
//
//    @FindBy(xpath = "")
//    private WebElement ;





    public WebElement getWebElement(String strButton) {

        switch (strButton) {

            case "usernameLogin": return usernameLogin;
            case "passwordLogin": return passwordLogin;
            case "loginBtn": return loginBtn;
            case "addBtn": return addBtn;
            case "statusSelect": return statusSelect;
            case "userRoleSelect": return userRoleSelect;
            case "employeeName": return employeeName;
           case "employeeNameList": return employeeNameList;
            case "userName": return userName;
            case "password": return password;
            case "confirmPassword": return confirmPassword;
            case "saveBtn": return saveBtn;
            case "invalidMsg": return invalidMsg;
//            case "statusSelectArrow": return statusSelectArrow;
//            case "userRoleSelectArrow": return userRoleSelectArrow;
            case "successMsg": return successMsg;
            case "cancel": return cancel;
//            case "": return ;
//            case "": return ;
        }

        return null;
    }


    public List<WebElement> getWebElementList(String strButton) {

        switch (strButton) {

           //   case "employeeNameList": return employeeNameList;

        }

        return null;

    }
}