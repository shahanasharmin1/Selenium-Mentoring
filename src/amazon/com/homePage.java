package amazon.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface homePage {
    WebDriver driver = new ChromeDriver();
    public static String chromeDriver ="webdriver.chrome.driver";
    public static String chromeDriverPath ="BrowserDriver/mac/chromedriver 8";
    public static String url ="https://www.amazon.com";



    public static void setUpDriver(String chromeDriver, String chromeDriverPath, String url) throws InterruptedException {

        System.setProperty(chromeDriver, chromeDriverPath);
        driver.manage().window().maximize();
        driver.manage().timeouts().wait(2000);
    }


    public static void main(String[] args) throws InterruptedException {
        //call the setUpDriver method
        setUpDriver(chromeDriver, chromeDriverPath, url);

        //add a waiting time
       // waitTime();
    }
}

