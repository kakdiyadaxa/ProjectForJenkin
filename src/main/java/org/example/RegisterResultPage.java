package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;
public class RegisterResultPage extends Utils{
    String getExpectedRegistrationCompleteMsg = "Your registration completed";
    String actualMessage;
    private By _registrationMessage = By.xpath("//div[@class='result']");
    private By _loginButton = By.xpath("//a[text()=\"Log in\"]");
    public void verifyUserRegisteredSuccessfully(){
        //print message
        actualMessage = getTextFromElement(_registrationMessage);
        //print message
        System.out.println("My message " + actualMessage);
        Assert.assertEquals(actualMessage,getExpectedRegistrationCompleteMsg);
        //click on CONTINUE
        //  clickOnElement(By.xpath("//a[text()=\"Continue\"]"));
    }
    public void clickOnLoginButton(){
        //click On Login Button
        clickOnElement(_loginButton);
    }


}
