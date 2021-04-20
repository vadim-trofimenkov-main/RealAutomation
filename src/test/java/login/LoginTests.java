package login;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserNameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        String actualResult = secureAreaPage.getMessage();
        String expectedResult = "You logged into a secure area!\n×";
        Assert.assertEquals(actualResult, expectedResult, "Message is wrong");
    }
}
