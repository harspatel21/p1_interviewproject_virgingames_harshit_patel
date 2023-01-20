package com.virgingames.pages;
// **** Created By Harshit Patel ****

import com.virgingames.utility.Utility;
import org.openqa.selenium.By;

public class SlingoPage extends Utility {

    By slingoLink = By.xpath("//span[contains(text(),'Slingo')]");
    By acceptCookies = By.xpath("//label[contains(text(),'Accept')]");
    By verifySlingoText = By.xpath("//h2[contains(text(),'What is Slingo?')]");

    //Method create to Click on Accept Cookies Button
    public void clickOnAcceptCookies() {
        clickOnElement(acceptCookies);
    }

    //Method create to Click on Slingo Link to Navigate to Slingo Page
    public void clickOnSlingoLink() {
        clickOnElement(slingoLink);

    }

    //Method create to get 'What is Slingo?' text from current page
    public String getWhatIsSlingotext() {
        return getTextFromElement(verifySlingoText);
    }
}
