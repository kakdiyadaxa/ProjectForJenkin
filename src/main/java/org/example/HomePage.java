package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class HomePage extends Utils{
    private By _registerButton = By.xpath("//a[@class=\"ico-register\"]");
    private By _appleMacBook = By.xpath("//a[text()=\"Apple MacBook Pro 13-inch\"]");
    private By _htcMobile = By.xpath("//div[@class=\"item-grid\"]/div[3]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _closeGreenLine = By.xpath("//span[@class= \"close\"]");
    private By _virtualGiftCard = By.xpath("//div[@class=\"item-grid\"]/div[4]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _closeGreenLine2 = By.xpath("//span[@class= \"close\"]");
    private By _clickGreenLine = By.xpath("//div[@class=\"bar-notification success\"]/p/a[@href=\"/compareproducts\"]");
    private By _compareProductsList = By.xpath("//a[text()=\"Compare products list\"]");
    public void clickOnRegisterButton(){
        //click on register button
        clickOnElement(_registerButton);
    }
    public void clickOnAppleMacBook(){
        //click On Apple MacBook
        clickOnElement(_appleMacBook);
    }
    public void addProductsToCompareList() {
        //click on Add to compare list for HTC One M8 Android L 5.0 Lollipop
        clickOnElement(_htcMobile);
        //close green line bar
        clickOnElement(_closeGreenLine);

        //click on Add to compare list for $25 Virtual Gift Card
        clickOnElement(_virtualGiftCard);

        //for time wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(_closeGreenLine2));

        //click on Compare products list
        clickOnElement(_compareProductsList);
    }

}
