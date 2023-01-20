package com.virgingames.testsuite;
// **** Created By Harshit Patel ****

import com.virgingames.pages.SlingoPage;
import com.virgingames.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SlingoPageTest extends BaseTest {

    SlingoPage slingoPage = new SlingoPage();

    @Test
    public void clickOnSlingoPageAndVerifyPage() {
        slingoPage.clickOnAcceptCookies();
        slingoPage.clickOnSlingoLink();
        String expectedMEssage = "What is Slingo?";
        Assert.assertEquals(slingoPage.getWhatIsSlingotext(), expectedMEssage, "Slingo Page is not Displayed");
        System.out.println("Text : " + "'" + slingoPage.getWhatIsSlingotext() + "'" + " is present on the Page");
    }

}
