package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    public static String url = "https://www.amazon.com/";
    public static String chromeDriver ="webdriver.chrome.driver";
    public static String chromeDriverPath ="BrowserDriver/mac/chromedriver 6";

    //Create driver object for Chrome Driver
   public static WebDriver driver = new ChromeDriver();

    
    public static void main(String[] args) throws InterruptedException {
        runChromeBrowser(chromeDriver,chromeDriverPath,url);
        waitFor(5000);
        closeBrowser();

    }

       public static void runChromeBrowser(String chromeDriver,String chromeDriverPath,String url){
           //Browser Driver
           System.setProperty(chromeDriver,chromeDriverPath);

           //Open Browser and Navigate to URL
           driver.get(url);
       }


       public static void closeBrowser(){
        //close Browser
        driver.close();

       }
       public static void waitFor(int miliSeconds) throws InterruptedException {
        Thread.sleep(miliSeconds);
       }











}
