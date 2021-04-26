package modals;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntryAdPage;

public class ModalTests extends BaseTest {
    @Test
    public void testEntryAd(){
        EntryAdPage entryAdPage = homePage.clickEntryAd();
        Assert.assertEquals(entryAdPage.getTitle(), "THIS IS A MODAL WINDOW", "Wrong modal Title");
        entryAdPage.closeModal();
    }
}
