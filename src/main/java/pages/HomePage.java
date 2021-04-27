package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.shiftingContent.ShiftingContentMainPage;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement clickLink(String linkText) {
        return driver.findElement(By.linkText(linkText));
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication").click();
        return new LoginPage(driver);
    }

    public ShiftingContentMainPage clickShiftingContent(){
        clickLink("Shifting Content").click();
        return new ShiftingContentMainPage(driver);
    }
    public DropdownPage clickDropdown() {
        clickLink("Dropdown").click();
        return new DropdownPage(driver);
    }
    public HoversPage clickHovers() {
        clickLink("Hovers").click();
        return new HoversPage(driver);
    }
    public KeyPressesPage clickKeyPresses() {
        clickLink("Key Presses").click();
        return new KeyPressesPage(driver);
    }
    public AlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts").click();
        return new AlertsPage(driver);
    }
    public FileUploadPage clickFileUpload() {
        clickLink("File Upload").click();
        return new FileUploadPage(driver);
    }
    public EntryAdPage clickEntryAd() {
        clickLink("Entry Ad").click();
        return new EntryAdPage(driver);
    }

    public ForgotPasswordPage clickEForgotPassword() {
        clickLink("Forgot Password").click();
        return new ForgotPasswordPage(driver);
    }
}
