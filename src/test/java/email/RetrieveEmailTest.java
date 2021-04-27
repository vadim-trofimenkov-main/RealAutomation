package email;

import baseTest.BaseTest;
import exception.NoForgotPasswordPageException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class RetrieveEmailTest extends BaseTest {
    @Test
    public void testPasswordRetrieve() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickEForgotPassword();
        if (forgotPasswordPage.getPageTitle().equals("Forgot Password")) {
            forgotPasswordPage.enterEmail("test.test@test.com");
            forgotPasswordPage.clickRetrievePasswordButton();
            String result = forgotPasswordPage.getPageResult();
            Assert.assertEquals(result, "Internal Server Error", "Password is not retrieved");
        } else throw new NoForgotPasswordPageException();
    }
}
