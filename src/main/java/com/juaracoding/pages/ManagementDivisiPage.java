package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagementDivisiPage {

    private WebDriver driver;
    public ManagementDivisiPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//p[normalize-space()='Divisi']")
    WebElement btnDivisi;
    @FindBy(xpath = "//input[@id='search']")
    WebElement inputSearchManagementDivisi;
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement btnSearchManagementDivisi;
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement btnResetManagementDivisi;
    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]")
    WebElement btnThreeBarManagementDivisi;
    @FindBy(xpath = "(//li[@role='menuitem'][normalize-space()='Edit'])[2]")
    WebElement btnThreeBarEditManagementDivisi;
    @FindBy(xpath = "(//li[@role='menuitem'][normalize-space()='Delete'])[1]")
    WebElement btnThreeBarDeleteManagementDivisi;
    @FindBy(xpath = "(//button[normalize-space()='Ya'])[1]")
    WebElement btnDeleteYesManagementDivisi;
    @FindBy(xpath = "//input[@id='name']")
    WebElement inputNamaDivisiThreeBarManagementDivisi;
    @FindBy(xpath = "//button[normalize-space()='Simpan']")
    WebElement btnSimpanDivisiManagementDivisi;
    @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
    WebElement btnTambahkanDivisiManagementDivisi;
    @FindBy(xpath = "//input[@id='name']")
    WebElement inputNamaDivisiManagementDivisi;
    @FindBy(xpath = "//button[normalize-space()='Tambah']")
    WebElement btnTambahDivisiManagementDivisi;

    public void BtnDivisi() { btnDivisi.click();}
    public void InputSearchManagementDivisi(String inputSearchDivisi) {this.inputSearchManagementDivisi.sendKeys(inputSearchDivisi);}
    public void BtnSearchManagementDivisi() { btnSearchManagementDivisi.click();}
    public void BtnResetManagementDivisi() { btnResetManagementDivisi.click();}
    public void BtnThreeBarManagementDivisi() { btnThreeBarManagementDivisi.click();}
    public void BtnThreeBarEditManagementUser() { btnThreeBarEditManagementDivisi.click();}
    public void BtnThreeBarDeleteManagementDivisi() { btnThreeBarDeleteManagementDivisi.click();}
    public void BtnDeleteYesManagementDivisi() { btnDeleteYesManagementDivisi.click();}
    public void ClearInputDivisiThreeBartManajemenDivisi() { inputNamaDivisiThreeBarManagementDivisi.clear();}
    public void InputNamaDivisiThreeBarManagementUser(String inputNamaKaryawanDivisiThreeBar) {this.inputNamaDivisiThreeBarManagementDivisi.sendKeys(inputNamaKaryawanDivisiThreeBar);}
    public void BtnSimpanEditManagementUser() { btnSimpanDivisiManagementDivisi.click();}
    public void BtnTambahkanDivisiManagementUser() { btnTambahkanDivisiManagementDivisi.click();}
    public void InputNamaDivisiManagementDivisi(String inputNamaDivisi) {this.inputNamaDivisiManagementDivisi.sendKeys(inputNamaDivisi);}
    public void BtnTambahDivisiManagementUser() { btnTambahDivisiManagementDivisi.click();}
}







