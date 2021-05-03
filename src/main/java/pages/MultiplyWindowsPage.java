package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultiplyWindowsPage {
    private WebDriver driver;
    private By clickHereLocator = By.linkText("Click Here");

    public MultiplyWindowsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickClickHere(){
        driver.findElement(clickHereLocator).click();
    }

}
