package com.juaracoding;

import com.juaracoding.pages.LoginDanLogoutPage;
import com.juaracoding.pages.DashboardPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestDashboard {

    static WebDriver driver;
    static ExtentTest extentTest;
    static DashboardPage dashboardPage = new DashboardPage();
    static LoginDanLogoutPage loginPage = new LoginDanLogoutPage();
    public TestDashboard(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click dashboard")
    public void user_click_dashboard(){
    Hooks.delay(10);
    loginPage.clearUsername();
    loginPage.clearpassword();
    loginPage.enterUsername("qa.tester@hadir.com");
    loginPage.enterPassword("qatester@dika");
    loginPage.BtnLogin();
    Hooks.delay(10);
    dashboardPage.BtnDashboard();
    extentTest.log(LogStatus.PASS, "User click dashboard");
    }
    @Then("User get text title page dashboard")
    public void user_get_text_title_page_dashboard() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(dashboardPage.getTxtDashboard(),"Dashboard");
        extentTest.log(LogStatus.PASS, "User get text title page dashboard");
    }
}
