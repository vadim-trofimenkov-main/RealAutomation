package pages.shiftingContent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShiftingContentMainPage {
    private WebDriver driver;
    private By header = By.xpath("//div[@class=\"example\"]//h3");
    private By menuElementLink1 = By.xpath("//div[@class=\"example\"]/a[1]");
    private By anImageLink2 = By.xpath("//div[@class=\"example\"]/a[2]");
    private By listLink3 = By.xpath("//div[@class=\"example\"]/a[3]");

    public ShiftingContentMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MenuElementPage clickMenuElementLink() {
        driver.findElement(menuElementLink1).click();
        return new MenuElementPage(driver);
    }
    public String getHeaderText(){
        return driver.findElement(header).getText();
    }
    public String getMenuElementLink1() {
        return driver.findElement(menuElementLink1).getText();
    }

    public String getAnImageLink2() {
        return driver.findElement(anImageLink2).getText();
    }

    public String getListLink3() {
        return driver.findElement(listLink3).getText();
    }
    //    public MenuElementPage clickAnImageLink(){
//        driver.findElement(menuElementLink1).click();
//        return new ImagePage(driver);
//    }
//    public MenuElementPage clickListLink(){
//        driver.findElement(menuElementLink1).click();
//        return new ListPage(driver);
//    }
}
