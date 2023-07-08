package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagementPendaftaranUserPage {

    private WebDriver driver;
    public ManagementPendaftaranUserPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aqx7sf'][normalize-space()='Pendaftaran User']")
    WebElement btnPendaftaranUser;
    @FindBy(xpath = "//input[@name='logo']")
    WebElement btnUploadFotoPendaftaranUser;
    @FindBy(xpath = "//input[@id='nik']")
    WebElement inputNikPendaftaranUser;
    @FindBy(xpath = "//input[@id='fullname']")
    WebElement inputNamaPendaftaranUser;
    @FindBy(xpath = "//input[@id='email']")
    WebElement inputEmailPendaftaranUser;
    @FindBy(xpath = "//input[@id='password']")
    WebElement inputPasswordPendaftaranUser;
    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-isbt42']//div[1]//div[1]//div[1]//div[1]//input[1]")
    WebElement inputDivisiPendaftaranUser;
    @FindBy(xpath = "//input[@placeholder='Pilih Unit']")
    WebElement inputUnitPendaftaranUser;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
    WebElement inputPosisiKerjaPendaftaranUser;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[1]/input[1]")
    WebElement inputJabatanPendaftaranUser;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/div[8]/div[1]/div[1]/div[1]/input[1]")
    WebElement inputTipeKontrakPendaftaranUser;
    @FindBy(xpath = "(//input[@id='free-solo-with-text-demo'])[8]")
    WebElement inputLokasiKerjaPendaftaranUser;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
    WebElement inputJadwalKerjaPendaftaranUser;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[4]/div[1]/div[1]")
    WebElement dropdownSelfiePendaftaranUser;
    @FindBy(xpath = "//li[normalize-space()='Selfie']")
    WebElement clickDropdownSelfiePendaftaranUser;
    @FindBy(xpath = "//input[@id='title']")
    WebElement inputJumlahCutiPendaftaranUser;
    @FindBy(xpath = "(//button[normalize-space()='Submit'])[1]")
    WebElement btnSubmitPendaftaranUser;
    @FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1kei35f'])[1]")
    WebElement txtInvalidCredentialsPendaftaranUser;


    public void BtnPendaftaranUser() { btnPendaftaranUser.click();}
    public void BtnUploadFotoPendaftaranUser(String btnUploadFoto) {this.btnUploadFotoPendaftaranUser.sendKeys(btnUploadFoto);}
    public void InputNikPendafataranUser(String inputNik) {this.inputNikPendaftaranUser.sendKeys(inputNik);}
    public void InputNamaPendafataranUser(String inputNama) {this.inputNamaPendaftaranUser.sendKeys(inputNama);}
    public void InputEmailPendafataranUser(String inputEmail) {this.inputEmailPendaftaranUser.sendKeys(inputEmail);}
    public void InputPasswordPendafataranUser(String inputPassword) {this.inputPasswordPendaftaranUser.sendKeys(inputPassword);}
    public void inputKeysArrowDownEnter(WebElement element) {
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.ENTER);}
    public void InputDivisiPendafataranUser(String inputDivisi) {this.inputDivisiPendaftaranUser.sendKeys(inputDivisi);}
    public void TestInputDivisiPendaftaranUser() {inputKeysArrowDownEnter(inputDivisiPendaftaranUser);}
    public void InputUnitPendafataranUser(String inputUnit) {this.inputUnitPendaftaranUser.sendKeys(inputUnit);}
    public void TestInputUnitPendaftaranUser() {inputKeysArrowDownEnter(inputUnitPendaftaranUser);}
    public void InputPosisiKerjaPendafataranUser() { inputPosisiKerjaPendaftaranUser.click();}
    public void TestInputPosisiKerjaPendaftaranUser() {inputKeysArrowDownEnter(inputPosisiKerjaPendaftaranUser);}
    public void InputJabatanPendafataranUser() { inputJabatanPendaftaranUser.click();}
    public void TestInputJabatanPendaftaranUser() {inputKeysArrowDownEnter(inputJabatanPendaftaranUser);}
    public void InputTipeKontrakPendafataranUser() { inputTipeKontrakPendaftaranUser.click();}
    public void TestInputTipeKontrakPendaftaranUser() {inputKeysArrowDownEnter(inputTipeKontrakPendaftaranUser);}
    public void InputLokasiKerjaPendafataranUser(String inputLokasiKerja) {this.inputLokasiKerjaPendaftaranUser.sendKeys(inputLokasiKerja);}
    public void TestInputLokasiKerjaPendaftaranUser() {inputKeysArrowDownEnter(inputLokasiKerjaPendaftaranUser);}
    public void InputJadwalKerjaPendafataranUser(String inputJadwalKerja) {this.inputJadwalKerjaPendaftaranUser.sendKeys(inputJadwalKerja);}
    public void TestInputJadwalKerjaPendaftaranUser() {inputKeysArrowDownEnter(inputJadwalKerjaPendaftaranUser);}
    public void DropdownSelfiePendaftaranUser() { dropdownSelfiePendaftaranUser.click();}
    public void ClickDropdownSelfiePendaftaranUser() {inputKeysArrowDownEnter(clickDropdownSelfiePendaftaranUser);}
    public void InputJumlahCutiPendafataranUser(String inputJumlahCuti) {this.inputJumlahCutiPendaftaranUser.sendKeys(inputJumlahCuti);}
    public void BtnSubmitPendaftaranUser() {btnSubmitPendaftaranUser.click();}
    public String getTxtInvalidCredentialsPendafatarnUser(){
        return txtInvalidCredentialsPendaftaranUser.getText();
    }
}
