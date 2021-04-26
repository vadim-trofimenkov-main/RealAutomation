package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadFiles = By.id("uploaded-files");

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public void uploadFile(String absoluteFilePath) {
        driver.findElement(inputField).sendKeys(absoluteFilePath);
        clickUploadButton();
    }

    public String getUploadedFiles() {
        return driver.findElement(uploadFiles).getText();
    }
}
