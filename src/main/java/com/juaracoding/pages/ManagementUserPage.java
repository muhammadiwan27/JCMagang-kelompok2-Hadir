package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagementUserPage {

    private WebDriver driver;
    public ManagementUserPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1ub5lza'][normalize-space()='Management']")
    WebElement btntabManagement;
    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='User']")
    WebElement btnUser;
    @FindBy(xpath = "//div[normalize-space()='Nama']")
    WebElement selectSearchManagementUser;
    @FindBy(xpath = "//li[normalize-space()='Nik']")
    WebElement btnSelectSearchManagementUserNik;
    @FindBy(xpath = "//input[@id='search']")
    WebElement inputSearchManagementUser;
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement btnSearchManagementUser;
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement btnResetManagementUser;
    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1k0lhp1']//*[name()='svg']")
    WebElement filterManagementUser;
    @FindBy(xpath = "//div[@id='mui-component-select-job_departement_id']")
    WebElement filterDepartmentManagementUser;
    @FindBy(xpath = "//div[@id='mui-component-select-job_level_id']")
    WebElement filterJobLevelManagementUser;
    @FindBy(xpath = "//div[@id='mui-component-select-employee_type_id']")
    WebElement filterTipeKaryawanManagementUser;
    @FindBy(xpath = "//div[@id='mui-component-select-job_position_id']")
    WebElement filterPosisiKerjaManagementUser;
    @FindBy(xpath = "//div[@id='mui-component-select-location_point_id']")
    WebElement filterLokasiKerjaManagementUser;
    @FindBy(xpath = "//li[normalize-space()='BCA Life']")
    WebElement selectFilterDepartmentManagementUser;
    @FindBy(xpath = "//li[normalize-space()='SPV']")
    WebElement selectFilterJobLevelManagementUser;
    @FindBy(xpath = "//li[normalize-space()='Magang']")
    WebElement selectFilterTipeKaryawanManagementUser;
    @FindBy(xpath = "//li[normalize-space()='Agent Call Center']")
    WebElement selectFilterPosisiKerjaManagementUser;
    @FindBy(xpath = "//li[normalize-space()='DIKA Medan']")
    WebElement selectFilterLokasiKerjaManagementUser;
    @FindBy(xpath = "//button[normalize-space()='Terapkan']")
    WebElement btnTerapkanFilterManagementUser;
    @FindBy(xpath = "(//button[@aria-label='action'])[1]")
    WebElement btnThreebarManagementUser;
    @FindBy(xpath = "(//li[@role='menuitem'][normalize-space()='Edit'])[1]")
    WebElement btnThreebarEditManagementUser;
    @FindBy(xpath = "(//li[@role='menuitem'][normalize-space()='Delete'])[1]")
    WebElement btnThreebarDeleteManagementUser;
    @FindBy(xpath = "//*[@id=\"fullname\"]")
    WebElement inputNamakaryawanEditJabatanEditManagementUser;
    @FindBy(xpath = "(//button[normalize-space()='Submit'])[1]")
    WebElement btnSubmitEditManagementUser;
    @FindBy(xpath = "//button[normalize-space()='Ya']")
    WebElement btnDeleteYesManagementUser;
    @FindBy(xpath = "//button[normalize-space()='Export']")
    WebElement btnExportManagementUser;
    @FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1kei35f'])[1]")
    WebElement txtInvalidCredentialsSearchNama;


    public void BtnTabManagement() { btntabManagement.click();}
    public void BtnUser() { btnUser.click();}
    public void SelectSearchManagementUser() { selectSearchManagementUser.click();}
    public void BtnSelectSearchManagementNik() { btnSelectSearchManagementUserNik.click();}
    public void InputSearchManagementUser(String inputsearch) {this.inputSearchManagementUser.sendKeys(inputsearch);}
    public void BtnSearchManagementUser() { btnSearchManagementUser.click();}
    public void BtnResetManagementUser() { btnResetManagementUser.click();}
    public void FilterManagementUser() { filterManagementUser.click();}
    public void FilterDepartmentManagementUser() { filterDepartmentManagementUser.click();}
    public void FilterJobLevelManagementUser() { filterJobLevelManagementUser.click();}
    public void FilterTipeKaryawanManagementUser() { filterTipeKaryawanManagementUser.click();}
    public void FilterPosisiKerjaManagementUser() { filterPosisiKerjaManagementUser.click();}
    public void FilterLokasiKerjaManagementUser() { filterLokasiKerjaManagementUser.click();}
    public void SelectFilterDepartmentManagementUser() { selectFilterDepartmentManagementUser.click();}
    public void SelectFilterJobLevelManagementUser() { selectFilterJobLevelManagementUser.click();}
    public void SelectFilterTipeKaryawanManagementUser() { selectFilterTipeKaryawanManagementUser.click();}
    public void SelectFilterPosisiKerjaManagementUser() { selectFilterPosisiKerjaManagementUser.click();}
    public void SelectFilterLokasiKerjaManagementUser() { selectFilterLokasiKerjaManagementUser.click();}
    public void BtnTerapkanFilterManagementUser() { btnTerapkanFilterManagementUser.click();}
    public void BtnThreeBarManagementUser() { btnThreebarManagementUser.click();}
    public void BtnThreeBarEditManagementUser() { btnThreebarEditManagementUser.click();}
    public void BtnThreeBarDeleteManagementUser() { btnThreebarDeleteManagementUser.click();}
    public void ClearInputNamaKaryawanEdit() { inputNamakaryawanEditJabatanEditManagementUser.clear();}
    public void InputNamaKaryawanEdit(String inputNamaKaryawanEdit) {this.inputNamakaryawanEditJabatanEditManagementUser.sendKeys(inputNamaKaryawanEdit);}
    public void BtnSubmitEditManagementUser() { btnSubmitEditManagementUser.click();}
    public void BtnDeleteYesManagementUser() { btnDeleteYesManagementUser.click();}
    public void BtnExportManagementUser() { btnExportManagementUser.click();}
    public String getTxtInvalidCredentialsSearchNama(){
        return txtInvalidCredentialsSearchNama.getText();
    }
}

