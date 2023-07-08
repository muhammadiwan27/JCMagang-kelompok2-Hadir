package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    private WebDriver driver;
    public DashboardPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1ub5lza'][normalize-space()='Dashboard']")
    WebElement btnDashboard;
    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1kei35f']")
    WebElement txtDashboard;

    public void BtnDashboard() { btnDashboard.click();}
    public String getTxtDashboard() { return txtDashboard.getText();
    }
}

