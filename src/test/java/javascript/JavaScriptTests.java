package javascript;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pages.LargeAndDeepDomPage;

public class JavaScriptTests extends BaseTest {
    @Test
    public void testJS(){
        LargeAndDeepDomPage largeAndDeepDomPage = homePage.clickLargeAndDeepDOM();
        largeAndDeepDomPage.scrollToTable();
    }
}
