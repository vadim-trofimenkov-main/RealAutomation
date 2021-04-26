package fileUpload;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUpload extends BaseTest {
    @Test
    public void testFileUpload(){
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile(
                "C:\\Users\\vadim\\IdeaProjects\\RealAutomation\\src\\test\\resources\\chromedriver.exe");
        Assert.assertEquals(fileUploadPage.getUploadedFiles(), "chromedriver.exe", "Wrong file upload");
    }
}
