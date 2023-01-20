package com.virgingames.utility;
// **** Created By Harshit Patel ****

import com.virgingames.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends ManageBrowser {

    /**
     * This Method will click on any find element
     */

    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    /**
     * This Method will get text from element
     */
    public String getTextFromElement(By by) {
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }
}

