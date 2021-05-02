package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By nestedFramesElement = By.xpath("//li/a[@href='/nested_frames']");
    private By iFrameElement = By.xpath("//li/a[@href='/iframe']");
    private By framesPageTitle = By.tagName("h3");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFramesLink() {
        driver.findElement(nestedFramesElement).click();
        return new NestedFramesPage(driver);
    }

    public NestedFramesPage clickIFrameLink() {
        driver.findElement(iFrameElement).click();
        return new NestedFramesPage(driver);
    }

    public String getFramesPageTitle() {
        return driver.findElement(framesPageTitle).getText();
    }

    public class NestedFramesPage {
        private WebDriver driver;
        private String mainBottomFrame = "frame-bottom";
        private String mainTopFrame = "frame-top";
        private String leftFrame = "frame-left";
        private String middleFrame = "frame-middle";
        private String rightFrame = "frame-right";

        private By middleFrameContentElement = By.tagName("body");
        private By bottomFrameContentElement = By.tagName("body");
        private By leftFrameContentElement = By.tagName("body");
        private By rightFrameContentElement = By.tagName("body");


        public NestedFramesPage(WebDriver driver) {
            this.driver = driver;
        }

        public void switchToParentFrame() {
            driver.switchTo().parentFrame();
        }

        public void switchToMainTopFrame() {
            driver.switchTo().frame(mainTopFrame);
        }

        public void switchToBottomFrame() {
            driver.switchTo().frame(mainBottomFrame);
        }

        public void switchToMiddleFrame() {
            switchToMainTopFrame();
            driver.switchTo().frame(middleFrame);
        }

        public void switchToRightFrame() {
            switchToMainTopFrame();
            driver.switchTo().frame(rightFrame);
        }

        public void switchToLeftFrame() {
            switchToMainTopFrame();
            driver.switchTo().frame(leftFrame);
        }

        public String getMiddleFrameText() {
            switchToMiddleFrame();
            String text = driver.findElement(middleFrameContentElement).getText();
            switchToParentFrame();
            return text;
        }

        public String getBottomFrameText() {
            switchToBottomFrame();
            String text = driver.findElement(bottomFrameContentElement).getText();
            switchToParentFrame();
            return text;
        }

        public String getLeftFrameText() {
            switchToLeftFrame();
            String text = driver.findElement(leftFrameContentElement).getText();
            switchToParentFrame();
            return text;
        }

        public String getRightFrameText() {
            switchToRightFrame();
            String text = driver.findElement(rightFrameContentElement).getText();
            switchToParentFrame();
            return text;
        }

    }


    public class IFramePage {
        private WebDriver driver;

        public IFramePage(WebDriver driver) {
            this.driver = driver;
        }
    }
}
