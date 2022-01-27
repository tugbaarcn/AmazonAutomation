package tests.smoketest;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SignInPageTest {

    SignInPage signInPage;


    @Test
    public void setSignInPage(){

        signInPage = new SignInPage();

        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_url"));

        signInPage.signInTab.click();
        signInPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
        signInPage.continueButton.click();
        String alertTextMessage = signInPage.alertText.getText();
        Assert.assertEquals(alertTextMessage,"There was a problem");

        signInPage.helpButton.click();
        signInPage.forgotPasswordButton.click();
        String passwordAssistanceText = signInPage.passwordAssistance.getText();
        Assert.assertEquals(passwordAssistanceText,"Password assistance");

        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();

        signInPage.accountCreateButton.click();
        String createAccountText = signInPage.createAccount.getText();
        Assert.assertEquals(createAccountText,"Create account");

    }


}
