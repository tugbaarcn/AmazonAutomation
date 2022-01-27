package tests.smoketest;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class CreateAccountPageTest {

    CreateAccountPage createAccountPage;

    @Test
    public void createAccountPageTest() throws InterruptedException {

        createAccountPage= new CreateAccountPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_url"));

        ReusableMethods.hover(createAccountPage.signInTab);
        createAccountPage.startHereText.click();
        createAccountPage.nameBox.sendKeys(Faker.instance().name().fullName());
        createAccountPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
        createAccountPage.passwordBox.sendKeys(Faker.instance().internet().password());
        createAccountPage.passwordCheckBox.sendKeys(Faker.instance().internet().password());
        createAccountPage.continueButton.click();

        Thread.sleep(3000);
        Assert.assertTrue(createAccountPage.passwordAlert.isDisplayed());

        createAccountPage.signInButton.click();
        Assert.assertEquals(createAccountPage.signInPage.getText(),"Sign-In");
        Driver.getDriver().navigate().back();
        createAccountPage.bussinessAccountButton.click();
        Assert.assertEquals(createAccountPage.bussinessAccountCreationMessage.getText(),"Let’s create your free Amazon Business account");


    }


}
