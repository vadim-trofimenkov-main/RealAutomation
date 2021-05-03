package baseTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import com.google.common.io.Files.*;

public class BaseTest {
    private EventFiringWebDriver driver ;
    //private WebDriver driver;
    private String link = "http://the-internet.herokuapp.com";
    protected HomePage homePage;

    @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
         driver = new EventFiringWebDriver(new ChromeDriver());
         driver.register(new EventReporter());
        // driver.get(link);
        // driver.navigate().to(link);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        goHome();
        //driver.manage().window().setSize(new Dimension(360, 720));
        // List<WebElement> aLinks = driver.findElements(By.tagName("a"));
        //   System.out.println("A-links quantity is "+ aLinks.size());
        // Assert.assertEquals(aLinks.size(), 46, "Wrong number of links");
        // System.out.println("Page title is " + driver.getTitle());
        homePage = new HomePage(driver);

    }

    @BeforeMethod
    public void goHome() {
        driver.get(link);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

    public void takeScreenshot(ITestResult result) {
        TakesScreenshot camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);

        try {
            com.google.common.io.Files.move(screenshot, new File("src/test/resources/screenshots/screenshot_"
                    + result.getName() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //  System.out.println(screenshot.getAbsolutePath());
    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            takeScreenshot(result);
        }
    }



    /*public static void main(String[] args) {
        BaseTest test = new BaseTest();
        try {
            test.setUp();
            test.tearDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/
}
