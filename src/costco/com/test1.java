package costco.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

    public static void main(String[] args) throws InterruptedException {

        String chromeDriver ="webdriver.chrome.driver";
        String chromeDriverPath ="BrowserDriver/mac/chromedriver 8";
        String url ="https://www.costco.com/";

        //Set the properties for the driver
        System.setProperty(chromeDriver, chromeDriverPath);


        //Create object for the chrome driver
        WebDriver driver = new ChromeDriver();

        //Open the browser
        driver.get(url);

        //@Test :do maximization
        driver.navigate().to("https://www.costco.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);


    }






    }

