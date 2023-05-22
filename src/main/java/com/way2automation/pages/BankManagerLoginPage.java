package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created By Kashyap patel
 */
public class BankManagerLoginPage extends Utility {
    // click On "Open Account" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccount;
    // Search customer that created in first test
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;
    // Select currency "Pound"
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currency;
    // 	click on "process" button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement process;

    // click On "Open Account" Tab
    public void clickOnOpenAccount() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(openAccount);
    }
    // Search customer that created in first test
    public void clickAndSelectCustomerName() throws InterruptedException {
        Thread.sleep(1000);
        // clickOnElement(By.xpath("//select[@id='userSelect']"));
        selectByVisibleTextFromDropDown(searchCustomer,"Harry Potter");
    }
    //Select currency "Pound"
    public void selectCurrency(String currencyText) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(currency,currencyText);
    }
    // 	click on "process" button
    public void clickOnProcessButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(process);
    }

    // Popup Displayed and verify Message
    public String verifyTextFromPopUp(){
        return getTextFromAlert();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
}
