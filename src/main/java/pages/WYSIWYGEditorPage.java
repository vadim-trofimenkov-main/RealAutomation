package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private final WebDriver driver;
    final String iframeId = "mce_0_ifr";
    private final By textArea = By.id("tinymce");
    private final By increaseIndentButton = By.xpath("//button[@title='Increase indent']");

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearTextArea() {
        switchToTextArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void switchToTextArea() {
        driver.switchTo().frame(iframeId);
    }

    public void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public void sendTextToTextArea(String text) {
        switchToTextArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void increaseIndent() {
        driver.findElement(increaseIndentButton).click();
    }

    public String getTextAreaContent() {
        switchToTextArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
}
