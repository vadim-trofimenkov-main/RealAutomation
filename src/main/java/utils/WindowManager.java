package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigation;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigation = driver.navigate();
    }

    public void goBack() {
        navigation.back();
    }

    public void goForward() {
        navigation.forward();
    }

    public void refresh() {
        navigation.refresh();
    }

    public void goTo(String url) {
        navigation.to(url);
    }

    public void switchToTab(String tabTitle) {
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Number of tabs: " + windows.size());
        System.out.println("Tabs titles: ");
        windows.forEach(System.out::println);

        for (String window : windows) {
            System.out.println("Switching to tab: " + window);
            driver.switchTo().window(window);
            System.out.println("Tab title is: " + driver.getTitle());

            if (tabTitle.equals(driver.getTitle())) {
                break;
            }
        }
    }
}
