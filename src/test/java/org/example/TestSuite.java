package org.example;
import org.testng.annotations.Test;
public class TestSuite extends BaseTest{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    AppleMacBookPage appleMacBookPage = new AppleMacBookPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    CompareListPage compareListPage = new CompareListPage();
    @Test
    public void verifyRegisteredUserShouldBeAbleToReferAProductToAFriendSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        //fill registration details
        registerPage.enterRegistrationDetails2();
        //click on login button

        registerResultPage.clickOnLoginButton();
        //fill login details
        loginPage.enterLoginDetails();
        //click on Apple MacBook Pro 13-inch
        homePage.clickOnAppleMacBook();
        //click on Email a friend
        appleMacBookPage.clickOnEmailAFriend();
        //fill in friend's email
        emailAFriendPage.fillInFriendEmail();
    }
    @Test
    public void verifyUserShouldBeAbleToCompareTheTwoProductsSuccessfully(){
        //add products to compare list
        homePage.addProductsToCompareList();
        //verify User Compared Products Successfully
        compareListPage.verifyUserComparedProductsSuccessfully();
    }
}
