package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;
public class EmailAFriendPage extends Utils{
    private By _friendEmail = By.xpath("//input[@class=\"friend-email\"]");
    private By _yourEmail = By.xpath("//input[@class=\"your-email\"]");
    private By _personalMessage = By.xpath("//textarea[@class=\"your-email\"]");
    private By _sendEmail = By.xpath("//button[@name=\"send-email\"]");
    private String getExpectedErrorEmailMessage = "Only registered customers can use email a friend feature";
    private By _emailErrorMessage = By.xpath("//li[text()=\"Only registered customers can use email a friend feature\"]");
    private String getExpectedEmailMessage = "Your message has been sent.";
    private By _emailMessage = By.xpath("//div[@class=\"result\"]");
    public void fillInFriendAndYourEmail() {
        //enter friend email
        typeText(_friendEmail,"sp@gmail.com");
        //enter your email
        typeText(_yourEmail,"jp@gmail.com");
        //enter message
        typeText(_personalMessage,"Hi, I recommended this product to you,I used it,it's very good");
        //click on send email
        clickOnElement(_sendEmail);
        //print out message
        String actualMessage = getTextFromElement(_emailErrorMessage);
        System.out.println("My Message: "+actualMessage);
        Assert.assertEquals(actualMessage,getExpectedErrorEmailMessage);
    }
    public void fillInFriendEmail(){
        //enter friend email
        typeText(_friendEmail,"sp@gmail.com");
        //enter message
        typeText(_personalMessage,"Hi, I recommended this product to you,I used it,it's very good");
        //click on send email
        clickOnElement(_sendEmail);
        //print out message
        String actualMessage = getTextFromElement(_emailMessage);
        System.out.println("My Message: "+actualMessage);
        Assert.assertEquals(actualMessage,getExpectedEmailMessage);
    }

}
