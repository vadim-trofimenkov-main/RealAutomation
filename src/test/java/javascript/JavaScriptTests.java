package javascript;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;
import pages.LargeAndDeepDomPage;

public class JavaScriptTests extends BaseTest {
    @Test
    public void testJS(){
        LargeAndDeepDomPage largeAndDeepDomPage = homePage.clickLargeAndDeepDOM();
        largeAndDeepDomPage.scrollToTable();
    }

    @Test
    public void testScrollToParagraph(){
        InfiniteScrollPage infiniteScrollPage = homePage.clickInfiniteScroll();
        infiniteScrollPage.scrollParagraph(5);
        Assert.assertEquals(infiniteScrollPage.getParagraphsCount(), 5, "Wrong number of paragraphs");
    }
}
