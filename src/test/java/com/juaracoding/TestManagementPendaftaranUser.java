package com.juaracoding;

import com.juaracoding.pages.ManagementPendaftaranUserPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class TestManagementPendaftaranUser {

    static WebDriver driver;
    static ExtentTest extentTest;
    static ManagementPendaftaranUserPage managementPendaftaranUserPage = new ManagementPendaftaranUserPage();

    public TestManagementPendaftaranUser() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click button pendaftaran user")
    public void user_click_button_pendaftaran_user() {
        Hooks.delay(Constants.DETIK);
        managementPendaftaranUserPage.BtnPendaftaranUser();
        extentTest.log(LogStatus.PASS, "User click button pendaftaran user");
    }
    @And("User click button upload pendaftaran user")
    public void user_click_button_upload_pendaftaran_user() {
        Hooks.delay(Constants.DETIK);
        managementPendaftaranUserPage.BtnUploadFotoPendaftaranUser("C:\\Users\\M1403QA\\Desktop\\sampleFile.jpeg");
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "User click button upload pendaftaran user");
    }
    @And("User input valid nik pendaftaran user")
    public void user_input_valid_nik_pendaftaran_user() {
        managementPendaftaranUserPage.InputNikPendafataranUser("18736453");
        extentTest.log(LogStatus.PASS, "User input valid nik pendaftaran user");
    }
    @And("User input valid nama pendaftaran user")
    public void user_input_valid_nama_pendaftaran_user() {
        managementPendaftaranUserPage.InputNamaPendafataranUser("Valentino Tamma");
        extentTest.log(LogStatus.PASS, "User input valid nama pendaftaran user");
    }
    @And("User input valid email pendaftaran user")
    public void user_input_valid_email_pendaftaran_user() {
        managementPendaftaranUserPage.InputEmailPendafataranUser("tamma231@gmail.com");
        extentTest.log(LogStatus.PASS, "User input valid email pendaftaran user");
    }
    @And("User input valid password pendaftaran user")
    public void user_input_valid_password_pendaftaran_user() {
        managementPendaftaranUserPage.InputPasswordPendafataranUser("Tamma12345");
        extentTest.log(LogStatus.PASS, "User input valid password pendaftaran user");
    }
    @And("User input valid divisi pendaftaran user")
    public void user_input_valid_divisi_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.InputDivisiPendafataranUser("OPS");
        Hooks.delay(3);
        managementPendaftaranUserPage.TestInputDivisiPendaftaranUser();
        extentTest.log(LogStatus.PASS, "User input valid divisi pendaftaran user");
    }
    @And("User input valid unit pendaftaran user")
    public void user_input_valid_unit_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.InputUnitPendafataranUser("BukaLapak");
        Hooks.delay(3);
        managementPendaftaranUserPage.TestInputUnitPendaftaranUser();
        extentTest.log(LogStatus.PASS, "User input valid unit pendaftaran user");
    }
    @And("User input valid posisi kerja pendaftaran user")
    public void user_input_valid_posisi_kerja_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.InputPosisiKerjaPendafataranUser();
        Hooks.delay(3);
        managementPendaftaranUserPage.TestInputPosisiKerjaPendaftaranUser();
        extentTest.log(LogStatus.PASS, "User input valid posisi kerja pendaftaran user");
    }
    @And("User input valid jabatan pendaftaran user")
    public void user_input_valid_jabatan_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.InputJabatanPendafataranUser();
        Hooks.delay(3);
        managementPendaftaranUserPage.TestInputJabatanPendaftaranUser();
        extentTest.log(LogStatus.PASS, "User input valid jabatan pendaftaran user");
    }
    @And("User input valid tipe kontrak pendaftaran user")
    public void user_input_valid_tipe_kontrak_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.InputTipeKontrakPendafataranUser();
        Hooks.delay(3);
        managementPendaftaranUserPage.TestInputTipeKontrakPendaftaranUser();
        extentTest.log(LogStatus.PASS, "User input valid tipe kontrak pendaftaran user");
    }
    @And("User input valid lokasi kerja pendaftaran user")
    public void user_input_valid_lokasi_kerja_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.InputLokasiKerjaPendafataranUser("DIKA 2");
        Hooks.delay(3);
        managementPendaftaranUserPage.TestInputLokasiKerjaPendaftaranUser();
        extentTest.log(LogStatus.PASS, "User input valid lokasi kerja pendaftaran user");
    }
    @And("User input valid jadwal kerja pendaftaran user")
    public void user_input_valid_jadwal_kerja_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.InputJadwalKerjaPendafataranUser("Hatata");
        Hooks.delay(3);
        managementPendaftaranUserPage.TestInputJadwalKerjaPendaftaranUser();
        extentTest.log(LogStatus.PASS, "User input valid jadwal kerja pendaftaran user");
    }
    @And("User input valid selfie pendaftaran user")
    public void user_input_valid_selfie_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.DropdownSelfiePendaftaranUser();
        Hooks.delay(3);
        managementPendaftaranUserPage.ClickDropdownSelfiePendaftaranUser();
        extentTest.log(LogStatus.PASS, "User input valid selfie pendaftaran user");
    }
    @And("User input valid jumlah cuti pendaftaran user")
    public void user_input_valid_jumlah_cuti_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.InputJumlahCutiPendafataranUser("12");
        extentTest.log(LogStatus.PASS, "User input valid jumlah cuti pendaftaran user");
    }
    @Then("User submit valid data pendaftaran user")
    public void user_submit_valid_data_pendaftaran_user() {
        Hooks.delay(Constants.DETIK);
        managementPendaftaranUserPage.BtnSubmitPendaftaranUser();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "User submit valid data pendaftaran user");
    }
    @When("User input invalid nik pendaftaran user")
    public void user_input_invalid_nik_pendaftaran_user() {
        Hooks.delay(Constants.DETIK);
        managementPendaftaranUserPage.BtnPendaftaranUser();
        Hooks.delay(3);
        managementPendaftaranUserPage.InputNikPendafataranUser("384899298");
        extentTest.log(LogStatus.PASS, "User input invalid nik pendaftaran user");
    }
    @And("User input invalid nama pendaftaran user")
    public void user_input_invalid_nama_pendaftaran_user() {
        managementPendaftaranUserPage.InputNamaPendafataranUser("Jeremy Hajs");
        extentTest.log(LogStatus.PASS, "User input invalid nama pendaftaran user");
    }
    @And("User input invalid email pendaftaran user")
    public void user_input_invalid_email_pendaftaran_user() {
        managementPendaftaranUserPage.InputEmailPendafataranUser("jeremy@gmail.com");
        extentTest.log(LogStatus.PASS, "User input invalid email pendaftaran user");
    }
    @And("User input invalid password pendaftaran user")
    public void user_input_invalid_password_pendaftaran_user() {
        managementPendaftaranUserPage.InputPasswordPendafataranUser("Akmfe12345");
        extentTest.log(LogStatus.PASS, "User input invalid password pendaftaran user");
    }
    @And("User input invalid divisi pendaftaran user")
    public void user_input_invalid_divisi_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.InputDivisiPendafataranUser("OPS");
        Hooks.delay(3);
        managementPendaftaranUserPage.TestInputDivisiPendaftaranUser();
        extentTest.log(LogStatus.PASS, "User input invalid divisi pendaftaran user");
    }
    @And("User input invalid unit pendaftaran user")
    public void user_input_invalid_unit_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.InputUnitPendafataranUser("BukaLapak");
        Hooks.delay(3);
        managementPendaftaranUserPage.TestInputUnitPendaftaranUser();
        extentTest.log(LogStatus.PASS, "User input invalid unit pendaftaran user");
    }
    @And("User input invalid posisi kerja pendaftaran user")
    public void user_input_invalid_posisi_kerja_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.InputPosisiKerjaPendafataranUser();
        Hooks.delay(3);
        managementPendaftaranUserPage.TestInputPosisiKerjaPendaftaranUser();
        extentTest.log(LogStatus.PASS, "User input invalid posisi kerja pendaftaran user");
    }
    @And("User input invalid jabatan pendaftaran user")
    public void user_input_invalid_jabatan_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.InputJabatanPendafataranUser();
        Hooks.delay(3);
        managementPendaftaranUserPage.TestInputJabatanPendaftaranUser();
        extentTest.log(LogStatus.PASS, "User input invalid jabatan pendaftaran user");
    }
    @And("User input invalid tipe kontrak pendaftaran user")
    public void user_input_invalid_tipe_kontrak_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.InputTipeKontrakPendafataranUser();
        Hooks.delay(3);
        managementPendaftaranUserPage.TestInputTipeKontrakPendaftaranUser();
        extentTest.log(LogStatus.PASS, "User input invalid tipe kontrak pendaftaran user");
    }
    @And("User input invalid lokasi kerja pendaftaran user")
    public void user_input_invalid_lokasi_kerja_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.InputLokasiKerjaPendafataranUser("DIKA 2");
        Hooks.delay(3);
        managementPendaftaranUserPage.TestInputLokasiKerjaPendaftaranUser();
        extentTest.log(LogStatus.PASS, "User input invalid lokasi kerja pendaftaran user");
    }
    @And("User input invalid jadwal kerja pendaftaran user")
    public void user_input_invalid_jadwal_kerja_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.InputJadwalKerjaPendafataranUser("Hatata");
        Hooks.delay(3);
        managementPendaftaranUserPage.TestInputJadwalKerjaPendaftaranUser();
        extentTest.log(LogStatus.PASS, "User input invalid jadwal kerja pendaftaran user");
    }
    @And("User input invalid selfie pendaftaran user")
    public void user_input_invalid_selfie_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.DropdownSelfiePendaftaranUser();
        Hooks.delay(3);
        managementPendaftaranUserPage.ClickDropdownSelfiePendaftaranUser();
        extentTest.log(LogStatus.PASS, "User input invalid selfie pendaftaran user");
    }
    @And("User input invalid jumlah cuti pendaftaran user")
    public void user_input_invalid_jumlah_cuti_pendaftaran_user() {
        Hooks.delay(3);
        managementPendaftaranUserPage.InputJumlahCutiPendafataranUser("12");
        extentTest.log(LogStatus.PASS, "User input invalid jumlah cuti pendaftaran user");
    }
    @And("User submit invalid data pendaftaran user")
    public void user_submit_invalid_data_pendaftaran_user() {
        Hooks.delay(Constants.DETIK);
        managementPendaftaranUserPage.BtnSubmitPendaftaranUser();
        Hooks.delay(5);
        extentTest.log(LogStatus.PASS, "User submit invalid data pendaftaran user");
    }
    @Then("User get text invalid credentials pendaftaran user")
    public void user_get_text_invalid_credentials_pendafatran_user() {
        Hooks.delay(Constants.DETIK);
        Assert.assertEquals(managementPendaftaranUserPage.getTxtInvalidCredentialsPendafatarnUser(),"Pendaftaran User");
        extentTest.log(LogStatus.PASS,"User get text invalid credentials pendaftaran user");
    }
}

