package slider;

import baseTest.BaseTest;
import exception.NoHorizontalSliderPageException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class HorizontalSliderTest extends BaseTest {
    @Test
    public void testHorizontalSlider() {
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();
        if (horizontalSliderPage.getPageTitle().equals("Horizontal Slider")) {
            horizontalSliderPage.setSliderValue(4);
            Assert.assertEquals(horizontalSliderPage.getRangeValue(), 4, "Wrong range");
        } else throw new NoHorizontalSliderPageException();
    }
}
