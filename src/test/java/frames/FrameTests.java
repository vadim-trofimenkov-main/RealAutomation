package frames;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

public class FrameTests extends BaseTest {
    @Test
    public void testEditor() {
        WYSIWYGEditorPage page = homePage.clickWYSIWYGEditor();
        String text1 = "Hello ";
        String text2 = "world!";
        page.clearTextArea();
        page.sendTextToTextArea(text1);
        page.increaseIndent();
        page.sendTextToTextArea(text2);
        Assert.assertEquals(page.getTextAreaContent(), text1+text2, "Wrong text in text area");
    }
}
