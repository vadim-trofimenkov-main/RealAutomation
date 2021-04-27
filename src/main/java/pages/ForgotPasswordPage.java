package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By forgotPasswordPageTitle = By.xpath("//div[@class='example']/h2");
    private By emailField = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");
    private By forgotPasswordPageResult = By.xpath("//h1");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle(){
        return driver.findElement(forgotPasswordPageTitle).getText();
    }
    public String getPageResult(){
        return driver.findElement(forgotPasswordPageResult).getText();
    }

    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickRetrievePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
    }
}
