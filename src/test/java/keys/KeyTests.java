package keys;

import baseTest.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

public class KeyTests extends BaseTest {

    @Test
    public void testBackSpace() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("Hello World!" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPressesPage.getResult(), "You entered: BACK_SPACE", "Wrong result");
    }

    @Test
    public void testShortcuts() {
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("Hello World!" + Keys.chord(Keys.CONTROL, "z"));
        Assert.assertEquals(keyPressesPage.getTargetValue(), "Hello World", "Wrong value");
    }
}
