package hovers;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoversTest extends BaseTest {
    @Test
    public void testHoverUser1(){
        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.PictureCaption caption = hoversPage.hoverOverPicture(0);
        Assert.assertTrue(caption.isCaptionDisplayed());
        Assert.assertEquals(caption.getHeaderText(), "name: user1", "Wrong user title");
        Assert.assertEquals(caption.getLinkText(), "View picture", "Wrong link text");
        Assert.assertEquals(caption.getLinkHref(), "http://the-internet.herokuapp.com/users/1", "Wrong link");
    }
}
