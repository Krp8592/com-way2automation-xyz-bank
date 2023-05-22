package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created By Kashyap patel
 */
public class AccountPage extends Utility {

    // click on "Deposit" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Deposit']")
    WebElement deposit;
    // Enter amount 100
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountTab;
    //click on "Deposit" Button
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickDeposit;
    // verify message "Deposit Successful"
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositSuccessfullyText;
    //click on "Withdrawl" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
    WebElement withdrawl;
    // Enter amount 50
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement withdrawalAmountTab;
    //click on "Deposit" Button
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement withdrawTab;
    //	verify message "Transaction Successful"
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement withdrawalSuccessfullyText;


    //click on "Deposit" Tab
    public void clickOnDepositTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(deposit);
    }

    // Enter amount 100
    public void enterAmount(String amount) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(amountTab, amount);
    }

    //click on "Deposit" Button
    public void clickDepositTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(clickDeposit);
    }

    // verify message "Deposit Successful"
    public String verifyDepositSuccessfullyTextMessage() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(depositSuccessfullyText);
    }

    //click on "Withdrawl" Tab
    public void clickOnWithdrawl() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(withdrawl);
    }

    //Enter amount 50
    public void enterWithdrawlAmount(String amount) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(withdrawalAmountTab, amount);
    }

    //click on "Deposit" Button
    public void clickOnWithdrawTransactionTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(withdrawTab);
    }

    //	verify message "Transaction Successful"
    public String verifyWithdrawalSuccessfullyTextMessage() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(withdrawalSuccessfullyText);
    }
}
