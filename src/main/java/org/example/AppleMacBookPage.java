package org.example;
import org.openqa.selenium.By;
public class AppleMacBookPage extends Utils{
    private By _emailFriend = By.xpath("//button[text()=\"Email a friend\"]");
    public void clickOnEmailAFriend(){
        //click on Email a friend
        clickOnElement(_emailFriend);
    }
}
