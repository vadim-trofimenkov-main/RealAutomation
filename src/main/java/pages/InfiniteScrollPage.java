package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By texBlock = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    //1- based index
    public void scrollParagraph(int index) {
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        while(getParagraphsCount() < index){
            javascriptExecutor.executeScript(script);
        }

    }

    public int getParagraphsCount() {
        return driver.findElements(texBlock).size();
    }
}
