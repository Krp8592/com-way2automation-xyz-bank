package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Created By Kashyap patel
 */
public class AddCustomerPage extends Utility {

    //click On "Add Customer" Tab
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomer;
    // Enter FirstName
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;
    // Enter Last Name
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;
    // Enter PostCode
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;
    // Click on Add Button
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addButton;


    // * 	click On "Add Customer" Tab
    public void clickOnAddCustomer() {
        clickOnElement(addCustomer);
    }

    // Enter First Name
    public void enterFirstname(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(firstName, value);
    }

    // Enter Last Name
    public void enterLastname(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(lastName, value);
    }

    // Enter PostCode
    public void enterPostCode(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(postCode, value);
    }

    // Click On Add Button
    public void clickOnAddButton() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(addButton);
    }

    // Popup Display
    public String verifyTextFromPopUp() {
        return getTextFromAlert();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
}
