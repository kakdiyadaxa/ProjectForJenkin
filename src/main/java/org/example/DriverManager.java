package org.example;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class DriverManager extends Utils{
    LoadProp loadProp = new LoadProp();
    MutableCapabilities sauceOptions = new MutableCapabilities();

    public String USERNAME = loadProp.getProperty("SAUCE_USERNAME");
    public String ACCESS_KEY = loadProp.getProperty("SAUCE_ACCESS_KEY");
    public boolean SAUCE_LAB = Boolean.parseBoolean(loadProp.getProperty("SAUCE"));
    public String browserName = loadProp.getProperty("browser");

//    public String USERNAME = System.getProperty("SAUCE_USERNAME");
//    public String ACCESS_KEY = System.getProperty("SAUCE_ACCESS_KEY");
//    public boolean SAUCE_LAB = Boolean.parseBoolean(System.getProperty("SAUCE"));
//    public String browserName = System.getProperty("browser");

    public String URL = "https://"+ USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com/wd/hub";

    public void  openBrowser(){
        if (SAUCE_LAB)
        {
            System.out.println("Running in sauceLab.....with browser " + browserName);

            if (browserName.equalsIgnoreCase("Chrome")) {
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setExperimentalOption("w3c", true);
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "112");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }else if (browserName.equalsIgnoreCase("Firefox")) {
                FirefoxOptions browserOptions = new FirefoxOptions();
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "112");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } else if (browserName.equalsIgnoreCase("Edge")) {
                EdgeOptions browserOptions = new EdgeOptions();
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "112");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        }else
        {
            if (browserName.equalsIgnoreCase("Chrome")) {
                //open Chrome browser
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("Firefox")) {
                //open firefox browser
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("Edge")) {
                //open edge browser
                driver = new EdgeDriver();
            }else {
                System.out.println("Your browser name is wrong or not implemented : " + browserName);
            }
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //maximizing the window
        driver.manage().window().maximize();
        //Typing url
        driver.get("https://demo.nopcommerce.com/");
    }
    public void closeBrowser(){
        //to close the browser
        driver.close();
    }

}
