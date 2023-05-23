package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Utils{
    private By _firstName = By.xpath("//input[@id=\"FirstName\"]");
    private By _lastName = By.xpath("//input[@id=\"LastName\"]");
    private By _email = By.xpath("//input[@id=\"Email\"]");
    private By _password = By.xpath("//input[@id=\"Password\"]");
    private By _confirmPassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
    private By _clickOnRegisterButton = By.xpath("//button[@name=\"register-button\"]");
    private By _day_DateOfBirth = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By _month_DateOfBirth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _year_DateOfBirth = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    public void enterRegistrationDetails2(){
        //type firstname
        typeText(_firstName, "FirstnameTest");
        //type lastname
        typeText(_lastName, "LastNameTest");

        //select index number for day
        Select day_DateOfBirth = new Select(driver.findElement(_day_DateOfBirth));
        day_DateOfBirth.selectByIndex(6);
        //select month text
        Select month_DateOfBirth = new Select(driver.findElement(_month_DateOfBirth));
        month_DateOfBirth.selectByVisibleText("October");
        //select year value
        Select year_DateOfBirth = new Select(driver.findElement(_year_DateOfBirth));
        year_DateOfBirth.selectByValue("1990");

        //type email address
        typeText(_email, "vb6"+timeStamp2+"@gmail.com");
        //type password
        typeText(_password, "test1234");
        //type confirm password
        typeText(_confirmPassword, "test1234");
        //click on register button
        clickOnElement(_clickOnRegisterButton);
    }

}
