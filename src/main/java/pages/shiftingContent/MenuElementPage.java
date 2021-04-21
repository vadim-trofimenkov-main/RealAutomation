package pages.shiftingContent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuElementPage {
    private WebDriver driver;
    private By header = By.xpath("//div[@class=\"example\"]/h3");
    private By menuItems = By.xpath("//ul//a");

    public MenuElementPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeaderText() {
        return driver.findElement(header).getText();
    }

    public List<WebElement> getMenuItems() {
        return driver.findElements(menuItems);
    }
}
