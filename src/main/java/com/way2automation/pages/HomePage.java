package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created By Kashyap patel
 */
public class HomePage extends Utility {

    //click On "Bank Manager Login" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement bankManager;

    // click on "Customer Login" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLogin;

    //     click On "Bank Manager Login" Tab
    public void clickOnBankMangerLogin(){
        clickOnElement(bankManager);
    }
    // click on "Customer Login" Tab
    public void clickOnCustomerLogin() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(customerLogin);
    }
}
