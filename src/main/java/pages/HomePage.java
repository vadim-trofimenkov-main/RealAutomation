package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    private WebElement clickLink(String linkText){
        return driver.findElement(By.linkText(linkText));
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication").click();
        return new LoginPage(driver);
    }

}
