package baseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;


public class BaseTest {
    private WebDriver driver;
    private String link = "http://the-internet.herokuapp.com/";
    protected HomePage homePage;

     @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        // driver.get(link);
        // driver.navigate().to(link);
        driver.manage().window().maximize();
        goHome();
        //driver.manage().window().setSize(new Dimension(360, 720));
        // List<WebElement> aLinks = driver.findElements(By.tagName("a"));
        //   System.out.println("A-links quantity is "+ aLinks.size());
        // Assert.assertEquals(aLinks.size(), 46, "Wrong number of links");
        // System.out.println("Page title is " + driver.getTitle());
        homePage = new HomePage(driver);

    }
    @BeforeMethod
    public void goHome(){
         driver.get(link);
    }

     @AfterClass
    public void tearDown() {
        driver.quit();
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
