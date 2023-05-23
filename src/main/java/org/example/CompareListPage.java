package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareListPage extends Utils{
    private By _virtualGiftCardText = By.xpath("//a[@href=\"/25-virtual-gift-card\"][text()=\"$25 Virtual Gift Card\"]");
    private By _htcMobileText = By.xpath("//a[@href=\"/htc-one-m8-android-l-50-lollipop\"][text()=\"HTC One M8 Android L 5.0 Lollipop\"]");
    private By _clearList = By.xpath("//A[@href='#'][text()='Clear list']");
    private By _compareListMessage = By.xpath("//div[@class='no-data'][text()='You have no items to compare.']");
    String getExpectedCompareAProductMsg = "You have no items to compare.";
    public void verifyUserComparedProductsSuccessfully(){
        //get text of $25 Virtual Gift Card and HTC One M8 Android L 5.0 Lollipop
        String name1 = getTextFromElement(_virtualGiftCardText);
        System.out.println(name1);
        String name2 = getTextFromElement(_htcMobileText);
        System.out.println(name2);

        //click on CLEAR LIST
        clickOnElement(_clearList);

        //get text for actual message
        String actualMessage = getTextFromElement(_compareListMessage);
        System.out.println("My Message :" + actualMessage);
        Assert.assertEquals(actualMessage, getExpectedCompareAProductMsg);
    }
}
