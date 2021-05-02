package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By horizontalSliderPageTitle = By.xpath("//div[@class='example']/h3");
    private By sliderElement = By.tagName("input");
    private By rangeElement = By.xpath("//span[@id='range']");
    private double rangeValue = 0;

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.findElement(horizontalSliderPageTitle).getText();
    }

    public void clickSlider() {
        driver.findElement(sliderElement).click();
        updateRangeValue();
    }
    public double getRangeValue() {
        return rangeValue;
    }

    public void updateRangeValue() {
        rangeValue = Double.parseDouble(driver.findElement(rangeElement).getText());
    }

    public void setSliderValue(double value) {
        clickSlider();
        while (rangeValue != value) {
            if (rangeValue < value) {
                driver.findElement(sliderElement).sendKeys(Keys.ARROW_RIGHT);
            } else {
                driver.findElement(sliderElement).sendKeys(Keys.ARROW_LEFT);
            }
            updateRangeValue();
        }
    }
}

