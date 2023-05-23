package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

/**
 * Created By Kashyap patel
 */
public class CustomersPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomersPage.class.getName());

    public CustomersPage() {
        PageFactory.initElements(driver,this);
    }

}
