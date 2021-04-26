package alerts;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertTests extends BaseTest {
    @Test
    public void testAlerts() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickAlertButton();
        alertsPage.acceptPopup();
        Assert.assertEquals(alertsPage.getResultText(), "You successfully clicked an alert", "Wrong result text");
    }
    @Test
    public void testConfirm(){
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickConfirmButton();
        String confirmText = alertsPage.getConfirmedText();
        alertsPage.dismissPopup();
        Assert.assertEquals(confirmText, "I am a JS Confirm", "Wrong Confirm Text");
        Assert.assertEquals(alertsPage.getResultText(), "You clicked: Cancel", "Wrong confirm result text");
    }
    @Test
    public void testPrompt() {
        AlertsPage alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.clickPromptButton();
        String text = "Hey there!";
        alertsPage.setPromptInput(text);
        alertsPage.acceptPopup();
        Assert.assertEquals(alertsPage.getResultText(), "You entered: Hey there!", "Wrong Prompt text");
    }
}
