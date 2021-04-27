package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By horizontalSliderPageTitle = By.xpath("//div[@class='example']/h3");
    private By sliderElement = By.tagName("input");
    private By rangeElement = By.xpath("//span[@id='range']");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle(){
        return driver.findElement(horizontalSliderPageTitle).getText();
    }

    public void clickSlider(){
        driver.findElement(sliderElement).click();
    }
    public String getRange(){
        return driver.findElement(rangeElement).getText();
    }

    public void setSliderValue(int value){
        clickSlider();
        for (int i = 0; i < value; i++) {
           driver.findElement(sliderElement).sendKeys(Keys.ARROW_RIGHT);
        }
    }
}
