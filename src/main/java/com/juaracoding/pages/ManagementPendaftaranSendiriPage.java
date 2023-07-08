package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagementPendaftaranSendiriPage {

    private WebDriver driver;
    public ManagementPendaftaranSendiriPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//p[normalize-space()='Pendaftaran Sendiri']")
    WebElement btnPendaftaranSendiri;
    @FindBy(xpath = "(//button[@aria-label='view data'])[1]")
    WebElement btnViewDataPendaftaranSendiri;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement inputDivisiPendaftaranSendiri;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
    WebElement inputUnitPendaftaranSendiri;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
    WebElement inputTipeKontrakPendaftaranSendiri;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
    WebElement inputPosisiKerjaPendaftaranSendiri;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[7]/div[1]/div[1]/div[1]/input[1]")
    WebElement inputJabatanPendaftaranSendiri;
    @FindBy(xpath = "(//input[@id='free-solo-with-text-demo'])[8]")
    WebElement inputLokasiKerjaPendaftaranSendiri;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
    WebElement inputJadwalKerjaPendaftaranSendiri;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[4]/div[1]/div[1]")
    WebElement dropdownSelfiePendaftaranSendiri;
    @FindBy(xpath = "(//li[normalize-space()='Selfie'])[1]")
    WebElement selectSelfiePendaftaranSendiri;
    @FindBy(xpath = "//input[@id='title']")
    WebElement inputJumlahCutiPendaftaranUser;
    @FindBy(xpath = "(//button[normalize-space()='Submit'])[1]")
    WebElement btnSubmitPendaftaranSendiri;
    @FindBy(xpath = "(//button[@aria-label='Delete data'])[1]")
    WebElement btnDeleteDataPendaftaranSendiri;
    @FindBy(xpath = "(//button[normalize-space()='Ya'])[1]")
    WebElement btnYesDeleteDataPendaftaranSendiri;
    @FindBy(xpath = "//button[normalize-space()='Tidak']")
    WebElement btnNoDeleteDataPendaftaranSendiri;
    @FindBy(xpath = "//h3[normalize-space()='Data User Registrasi Mobile']")
    WebElement txtInvalidCredentialsPendaftaranSendiri;

    public void BtnPendaftaranSendiri() { btnPendaftaranSendiri.click();}
    public void BtnViewDataPendaftaranSendiri() { btnViewDataPendaftaranSendiri.click();}
    public void BtnDeleteDataPendaftaranSendiri() { btnDeleteDataPendaftaranSendiri.click();}
    public void inputKeysArrowDownEnter(WebElement element) {
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.ENTER);}
    public void InputDivisiPendafataranSendiri(String inputDivisiPendaftaranSendiri) {this.inputDivisiPendaftaranSendiri.sendKeys(inputDivisiPendaftaranSendiri);}
    public void TestInputDivisiPendaftaranSendiri() {inputKeysArrowDownEnter(inputDivisiPendaftaranSendiri);}
    public void InputUnitPendafataranSendiri(String inputUnitPendaftaranSendiri) {this.inputUnitPendaftaranSendiri.sendKeys(inputUnitPendaftaranSendiri);}
    public void TestInputUnitPendaftaranSendiri() {inputKeysArrowDownEnter(inputUnitPendaftaranSendiri);}
    public void InputTipeKontrakPendafataranSendiri() { inputTipeKontrakPendaftaranSendiri.click();}
    public void TestInputTipeKontrakPendaftaranSendiri() {inputKeysArrowDownEnter(inputTipeKontrakPendaftaranSendiri);}
    public void InputPosisiKerjaPendafataranSendiri() { inputPosisiKerjaPendaftaranSendiri.click();}
    public void TestInputPosisiKerjaPendaftaranUser() {inputKeysArrowDownEnter(inputPosisiKerjaPendaftaranSendiri);}
    public void InputJabatanPendafataranSendiri() { inputJabatanPendaftaranSendiri.click();}
    public void TestInputJabatanPendaftaranSendiri() {inputKeysArrowDownEnter(inputJabatanPendaftaranSendiri);}
    public void InputLokasiKerjaPendafataranSendiri(String inputLokasiKerjaPendaftaranSendiri) {this.inputLokasiKerjaPendaftaranSendiri.sendKeys(inputLokasiKerjaPendaftaranSendiri);}
    public void TestInputLokasiKerjaPendaftaranSendiri() {inputKeysArrowDownEnter(inputLokasiKerjaPendaftaranSendiri);}
    public void InputJadwalKerjaPendafataranSendiri() { inputJadwalKerjaPendaftaranSendiri.click();}
    public void TestInputJadwalKerjaPendaftaranSendiri() {inputKeysArrowDownEnter(inputJadwalKerjaPendaftaranSendiri);}
    public void DropdownSelfiePendaftaranSendiri() { dropdownSelfiePendaftaranSendiri.click();}
    public void SelectSelfiePendaftaranSendiri() {inputKeysArrowDownEnter(selectSelfiePendaftaranSendiri);}
    public void InputJumlahCutiPendafataranSendiri(String inputJumlahCutiPendaftaranSendiri) {this.inputJumlahCutiPendaftaranUser.sendKeys(inputJumlahCutiPendaftaranSendiri);}
    public void BtnSubmitPendaftaranSendiri() {btnSubmitPendaftaranSendiri.click();}
    public void BtnYesDeletePendaftaranSendiri() { btnYesDeleteDataPendaftaranSendiri.click();}
    public void BtnNoDeletePendaftaranSendiri() { btnNoDeleteDataPendaftaranSendiri.click();}
    public String getTxtInvalidCredentialsPendaftaranSendiri(){ return txtInvalidCredentialsPendaftaranSendiri.getText();
    }
}
