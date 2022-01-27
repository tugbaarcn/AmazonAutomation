package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CreateAccountPage {

    public CreateAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "nav-link-accountList")
    public WebElement signInTab;

    @FindBy(partialLinkText = "Start")
    public WebElement startHereText;

    @FindBy (id ="ap_customer_name")
    public WebElement nameBox;

    @FindBy(id="ap_email")
    public WebElement emailBox;

    @FindBy (id="ap_password")
    public WebElement passwordBox;

    @FindBy(id="ap_password_check")
    public WebElement passwordCheckBox;

    @FindBy(id="continue")
    public WebElement continueButton;

    @FindBy(xpath = "(//a)[5]")
    public WebElement signInButton;

    @FindBy(tagName = "h1")
    public WebElement signInPage;

    @FindBy(id="ab-registration-link")
    public WebElement bussinessAccountButton;

    @FindBy(xpath = "(//span)[7]")
    public WebElement bussinessAccountCreationMessage;

    @FindBy(xpath = "(//div[@class='a-alert-content'])[9]")
    public WebElement passwordAlert;





}
