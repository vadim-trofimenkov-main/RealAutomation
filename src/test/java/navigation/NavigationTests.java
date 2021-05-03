package navigation;

import baseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import utils.WindowManager;

public class NavigationTests extends BaseTest {
    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://tut.by");
    }

    @Test
    public void testSwitchToTab(){
        homePage.clickMultipleWindows().clickClickHere();
        getWindowManager().switchToTab("New Window");
    }
}
