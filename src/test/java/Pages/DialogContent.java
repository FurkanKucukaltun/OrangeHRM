package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(xpath = "//label[text()='User Role']/../following-sibling::div")
    private WebElement userRoleSelect;

    @FindBy(xpath = "//label[text()='Status']/../following-sibling::div")
    private WebElement statusSelect;

    @FindBy(xpath = "//label[text()='Employee Name']/../following-sibling::div")
    private WebElement employeeName;

    @FindBy(xpath = "//label[text()='Username']/../following-sibling::div")
    private WebElement userName;

    @FindBy(xpath = "//label[text()='Password']/../following-sibling::div")
    private WebElement password;

    @FindBy(xpath = "//label[text()='Confirm Password']/../following-sibling::div")
    private WebElement confirmPassword;

    @FindBy(xpath = "//button[text()=' Save ']")
    private WebElement saveBtn;

//    @FindBy(xpath = "")
//    private WebElement ;
//
//    @FindBy(xpath = "")
//    private WebElement ;
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
            case "userName": return userName;
            case "password": return password;
            case "confirmPassword": return confirmPassword;
            case "saveBtn": return saveBtn;
//            case "": return ;
//            case "": return ;
//            case "": return ;
//            case "": return ;
        }

        return null;
    }

}
