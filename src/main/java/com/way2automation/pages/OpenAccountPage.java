package com.way2automation.pages;

import com.way2automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

/**
 * Created By Kashyap patel
 */
public class OpenAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    public OpenAccountPage() {
        PageFactory.initElements(driver,this);
    }
}
