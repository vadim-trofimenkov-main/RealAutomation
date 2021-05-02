package frames;

import baseTest.BaseTest;
import exception.NoFramesPageException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesPage;

public class NestedFramesTest extends BaseTest {
    @Test
    public void testMiddleFrame() {
        FramesPage framesPage = homePage.clickFrames();
        if (framesPage.getFramesPageTitle().equals("Frames")) {
            FramesPage.NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesLink();
            String middleFrameText = nestedFramesPage.getMiddleFrameText();
            Assert.assertEquals(middleFrameText, "MIDDLE", "Wrong text in Middle Frame");
        } else throw new NoFramesPageException();
    }

    @Test
    public void testBottomFrame() {
        FramesPage framesPage = homePage.clickFrames();
        if (framesPage.getFramesPageTitle().equals("Frames")) {
            FramesPage.NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesLink();
            String bottomFrameText = nestedFramesPage.getBottomFrameText();
            Assert.assertEquals(bottomFrameText, "BOTTOM", "Wrong text in BOTTOM Frame");
        } else throw new NoFramesPageException();
    }
    @Test
    public void testLeftFrame() {
        FramesPage framesPage = homePage.clickFrames();
        if (framesPage.getFramesPageTitle().equals("Frames")) {
            FramesPage.NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesLink();
            String bottomFrameText = nestedFramesPage.getLeftFrameText();
            Assert.assertEquals(bottomFrameText, "LEFT", "Wrong text in LEFT Frame");
        } else throw new NoFramesPageException();
    }
    @Test
    public void testRightFrame() {
        FramesPage framesPage = homePage.clickFrames();
        if (framesPage.getFramesPageTitle().equals("Frames")) {
            FramesPage.NestedFramesPage nestedFramesPage = framesPage.clickNestedFramesLink();
            String bottomFrameText = nestedFramesPage.getRightFrameText();
            Assert.assertEquals(bottomFrameText, "RIGHT", "Wrong text in RIGHT Frame");
        } else throw new NoFramesPageException();
    }
}
