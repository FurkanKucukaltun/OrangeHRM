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

    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
    private WebElement userRoleSelect;

    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
    private WebElement statusSelect;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement employeeName;

    @FindBy(xpath = "//div[@role='listbox']")
    private WebElement employeeNameList;

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

    @FindBy(xpath = "//*[text()='Should be at least 5 characters']")
    private WebElement errorMsg;

    @FindBy(xpath = "//h6[text()='Add User']")
    private WebElement AddUserHeading;

    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[2]")
    private WebElement confirmPasswordMsg;

      @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[1]")
    private WebElement required;

    @FindBy(xpath = "//span[text()='Already exists']")
    private WebElement alreadyExists;

    @FindBy(xpath = "//span[text()='Should have at least 8 characters']")
    private WebElement atLeastEightCharacters;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    private WebElement passwordChr;

    @FindBy(xpath = "//*[@class='oxd-table-card']//div[text()='Jasmine Morgan']")
    private WebElement JasmineMorgan;

    @FindBy(xpath = "//*[text()='Success']")
    private WebElement successMsg;

    @FindBy(xpath = "(//button[@type='button'])[2]")
    private WebElement cancel;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper']/div[@role='listbox']/div)[2]")
    private WebElement selectStatusEnable;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper']/div[@role='listbox']/div)[3]")
    private WebElement selectRoleESS;

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
            case "errorMsg": return errorMsg;
            case "AddUserHeading": return AddUserHeading;
            case "confirmPasswordMsg": return confirmPasswordMsg;
            case "passwordChr": return passwordChr;
            case "required": return required;
            case "alreadyExists": return alreadyExists;
            case "atLeastEightCharacters": return atLeastEightCharacters;
            case "Jasmine Morgan": return JasmineMorgan;
            case "successMsg": return successMsg;
            case "cancel": return cancel;
            case "selectStatusEnable": return selectStatusEnable;
            case "selectRoleESS": return selectRoleESS;
        }
        return null;
    }
}