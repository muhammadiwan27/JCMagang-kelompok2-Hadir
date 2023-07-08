package com.juaracoding;

import com.juaracoding.pages.ManagementUserPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class TestManagementUser {

    static WebDriver driver;
    static ExtentTest extentTest;
    static ManagementUserPage managementUserPage = new ManagementUserPage();
    public TestManagementUser(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click tab management")
    public void user_click_tab_management(){
       managementUserPage.BtnTabManagement();
       extentTest.log(LogStatus.PASS, "User click tab management");
    }
    @And("User click button user")
    public void user_click_button_user() {
        Hooks.delay(Constants.DETIK);
        managementUserPage.BtnUser();
        Hooks.delay(4);
        extentTest.log(LogStatus.PASS, "User click button user");
    }
    @And("User search valid data based nama")
    public void user_search_valid_data_based_nama() {
        Hooks.delay(Constants.DETIK);
        managementUserPage.InputSearchManagementUser("Rika Testing");
        Hooks.delay(4);
        managementUserPage.BtnSearchManagementUser();
        extentTest.log(LogStatus.PASS, "User search valid data based nama");
    }

    @And("User search valid data based nik")
    public void user_search_valid_data_based_nik() {
        Hooks.delay(Constants.DETIK);
        managementUserPage.BtnResetManagementUser();
        managementUserPage.SelectSearchManagementUser();
        Hooks.delay(Constants.DETIK);
        managementUserPage.BtnSelectSearchManagementNik();
        managementUserPage.InputSearchManagementUser("3765909827485029");
        Hooks.delay(4);
        managementUserPage.BtnSearchManagementUser();
        extentTest.log(LogStatus.PASS, "User search valid data based nik");
    }
    @And("User filter valid data based department")
    public void user_filter_valid_data_based_department() {
        Hooks.delay(Constants.DETIK);
        managementUserPage.FilterManagementUser();
        Hooks.delay(2);
        managementUserPage.FilterDepartmentManagementUser();
        Hooks.delay(Constants.DETIK);
        managementUserPage.SelectFilterDepartmentManagementUser();
        managementUserPage.BtnTerapkanFilterManagementUser();
        Hooks.delay(8);
        extentTest.log(LogStatus.PASS, "User filter valid data based department");
    }
    @And("User filter valid data based job level")
    public void user_filter_valid_data_based_job_level() {
        Hooks.delay(Constants.DETIK);
        managementUserPage.FilterManagementUser();
        Hooks.delay(2);
        managementUserPage.FilterJobLevelManagementUser();
        Hooks.delay(Constants.DETIK);
        managementUserPage.SelectFilterJobLevelManagementUser();
        managementUserPage.BtnTerapkanFilterManagementUser();
        Hooks.delay(8);
        extentTest.log(LogStatus.PASS, "User filter valid data based job level");
    }
    @And("User filter valid data based tipe karyawan")
    public void user_filter_valid_data_based_tipe_karyawan() {
        Hooks.delay(Constants.DETIK);
        managementUserPage.FilterManagementUser();
        Hooks.delay(2);
        managementUserPage.FilterTipeKaryawanManagementUser();
        Hooks.delay(Constants.DETIK);
        managementUserPage.SelectFilterTipeKaryawanManagementUser();
        managementUserPage.BtnTerapkanFilterManagementUser();
        Hooks.delay(8);
        extentTest.log(LogStatus.PASS, "User filter valid data based tipe karyawan");
    }
    @And("User filter valid data based posisi kerja")
    public void user_filter_valid_data_based_posisi_kerja() {
        Hooks.delay(Constants.DETIK);
        managementUserPage.FilterManagementUser();
        Hooks.delay(2);
        managementUserPage.FilterPosisiKerjaManagementUser();
        Hooks.delay(Constants.DETIK);
        managementUserPage.SelectFilterPosisiKerjaManagementUser();
        managementUserPage.BtnTerapkanFilterManagementUser();
        Hooks.delay(8);
        extentTest.log(LogStatus.PASS, "User filter valid data based posisi kerja");
    }
    @And("User filter valid data based lokasi kerja")
    public void user_filter_valid_data_based_lokasi_kerja() {
        Hooks.delay(Constants.DETIK);
        managementUserPage.FilterManagementUser();
        Hooks.delay(2);
        managementUserPage.FilterLokasiKerjaManagementUser();
        Hooks.delay(Constants.DETIK);
        managementUserPage.SelectFilterLokasiKerjaManagementUser();
        managementUserPage.BtnTerapkanFilterManagementUser();
        Hooks.delay(8);
        extentTest.log(LogStatus.PASS, "User filter valid data based posisi kerja");
    }
    @And("User edit valid data")
    public void user_edit_valid_data() {
        Hooks.delay(Constants.DETIK);
        managementUserPage.BtnUser();
        Hooks.delay(3);
        managementUserPage.BtnThreeBarManagementUser();
        Hooks.delay(3);
        managementUserPage.BtnThreeBarEditManagementUser();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,30)");
        Hooks.delay(3);
        managementUserPage.ClearInputNamaKaryawanEdit();
        Hooks.delay(3);
        managementUserPage.InputNamaKaryawanEdit("Jaka Fikri");
        managementUserPage.BtnSubmitEditManagementUser();
        Hooks.delay(8);
        extentTest.log(LogStatus.PASS, "User edit valid data");
    }
    @And("User delete valid data")
    public void user_delete_valid_data() {
        Hooks.delay(Constants.DETIK);
        managementUserPage.BtnUser();
        managementUserPage.BtnThreeBarManagementUser();
        managementUserPage.BtnThreeBarDeleteManagementUser();
        Hooks.delay(5);
        managementUserPage.BtnDeleteYesManagementUser();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "User delete valid data");
    }
    @Then("User export valid data")
    public void user_export_valid_data() {
       managementUserPage.BtnUser();
       Hooks.delay(3);
       managementUserPage.BtnExportManagementUser();
       Hooks.delay(3);
       extentTest.log(LogStatus.PASS, "User export valid data");
    }
    @When("User search invalid data based nama")
    public void user_search_invalid_data_based_nama() {
        Hooks.delay(Constants.DETIK);
        managementUserPage.InputSearchManagementUser("Udmoqodbnyei");
        managementUserPage.BtnSearchManagementUser();
        extentTest.log(LogStatus.PASS, "User search invalid data based nama");
    }
    @Then("User get text invalid credentials search nama")
    public void user_get_text_invalid_credentials_search_nama(){
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(managementUserPage.getTxtInvalidCredentialsSearchNama(),"User");
        extentTest.log(LogStatus.PASS,"User get text invalid credentials search nama");
    }
}
