package org.example;
import org.openqa.selenium.By;
public class LoginPage extends Utils{
    private By _email = By.xpath("//input[@id=\"Email\"]");
    private By _password = By.xpath("//input[@id=\"Password\"]");
    private By _logInButton = By.xpath("//button[@class=\"button-1 login-button\"]");
    public void enterLoginDetails(){
        //type email address
        typeText(_email, "vb6"+timeStamp2+"@gmail.com");
        //type password
        typeText(_password, "test1234");
        //click on LOG IN button
        clickOnElement(_logInButton);
    }
}
