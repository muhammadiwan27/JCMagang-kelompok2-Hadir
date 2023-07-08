package com.juaracoding;

import com.juaracoding.pages.ManagementDivisiPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TestManagementDivisi {

    static WebDriver driver;
    static ExtentTest extentTest;
    static ManagementDivisiPage managementDivisiPage = new ManagementDivisiPage();
    public TestManagementDivisi() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click button divisi")
    public void user_click_button_divisi(){
        Hooks.delay(Constants.DETIK);
        managementDivisiPage.BtnDivisi();
        extentTest.log(LogStatus.PASS, "User click button divisi");
    }
    @And("User search valid data divisi")
    public void user_search_valid_data_divisi() {
        Hooks.delay(Constants.DETIK);
        managementDivisiPage.InputSearchManagementDivisi("OPS");
        managementDivisiPage.BtnSearchManagementDivisi();
        extentTest.log(LogStatus.PASS, "User search valid data divisi");
    }
    @And("User reset search data divisi")
    public void user_reset_search_data_divisi() {
        Hooks.delay(Constants.DETIK);
        managementDivisiPage.BtnResetManagementDivisi();
        extentTest.log(LogStatus.PASS, "User reset search data divisi");
    }
    @And("User edit valid data divisi")
    public void user_edit_valid_data_divisi() {
        Hooks.delay(Constants.DETIK);
        managementDivisiPage.BtnDivisi();
        managementDivisiPage.BtnThreeBarManagementDivisi();
        managementDivisiPage.BtnThreeBarEditManagementUser();
        Hooks.delay(3);
        managementDivisiPage.ClearInputDivisiThreeBartManajemenDivisi();
        Hooks.delay(3);
        managementDivisiPage.InputNamaDivisiThreeBarManagementUser("Bank CIMB NIAGA");
        managementDivisiPage.BtnSimpanEditManagementUser();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "User edit valid data divisi");
    }
    @And("User delete valid data divisi")
    public void user_delete_valid_data_divisi() {
        Hooks.delay(Constants.DETIK);
        managementDivisiPage.BtnDivisi();
        managementDivisiPage.BtnThreeBarManagementDivisi();
        managementDivisiPage.BtnThreeBarDeleteManagementDivisi();
        Hooks.delay(5);
        managementDivisiPage.BtnDeleteYesManagementDivisi();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "User delete valid data divisi");
    }
    @Then("User add valid data divisi")
    public void user_add_valid_data_divisi() {
        managementDivisiPage.BtnDivisi();
        Hooks.delay(3);
        managementDivisiPage.BtnTambahkanDivisiManagementUser();
        Hooks.delay(3);
        managementDivisiPage.InputNamaDivisiManagementDivisi("Bank Central Asia");
        Hooks.delay(3);
        managementDivisiPage.BtnTambahDivisiManagementUser();
        extentTest.log(LogStatus.PASS, "User add valid data divisi");
    }
}
