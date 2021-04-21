package numberOfMenuItems;

import baseTest.BaseTest;
import exception.NoMenuElementPageException;
import exception.NoShiftingContentPageException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.shiftingContent.MenuElementPage;
import pages.shiftingContent.ShiftingContentMainPage;


public class CheckNumberOfItems extends BaseTest {
    @Test
    public void testNumberOfMenuElementItems() {
        ShiftingContentMainPage shiftingContentMainPage = homePage.clickShiftingContent();
        if (shiftingContentMainPage.getHeaderText().equals("Shifting Content")) {
            MenuElementPage menuElementPage = shiftingContentMainPage.clickMenuElementLink();
            if (menuElementPage.getHeaderText().equals("Shifting Content: Menu Element")) {
                int numberOfMenuElementItems = menuElementPage.getMenuItems().size();
                int expectedResult = 5;
                Assert.assertEquals(numberOfMenuElementItems, expectedResult, "The number of Shifting Content: Menu Element is wrong");
                System.out.println("Success! The number of Shifting Content Menu Elements is correct " +
                        "Expected: 5, Found:" + numberOfMenuElementItems);
            } else throw new NoMenuElementPageException();
        } else throw new NoShiftingContentPageException();
    }
}
