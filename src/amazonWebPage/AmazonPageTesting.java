package amazonWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPageTesting {
    public static void main(String[] args) throws InterruptedException {
        //Set the properties for the driver
        System.setProperty("webdriver.chrome.driver","BrowserDriver/mac/chromedriver 8");
        //Create object for the chrome driver
        WebDriver driver = new ChromeDriver();
        //Open the browser
        driver.get("https://www.amazon.com");

        //@Test-1 :do maximization
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //@Test-2 :sign in
        driver.findElement(By.id("nav-link-accountList")).click();

        //@Test-3 :email id
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("ssevmesh@gmail.com");
        Thread.sleep(2000);

        //@Test-4 :click in email id
        driver.findElement(By.cssSelector("#continue")).click();
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("abcd1234");


        driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(2000);

        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#a-autoid-0 > span > input")).click();

        //we are using link Text
        driver.findElement(By.linkText("Gift Cards")).click();
        Thread.sleep(2000);

        //we are using partial link Text
       // driver.findElement(By.partialLinkText("Gift")).click();

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("disposable face mask");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Modenna Face Mask Disposable Blue 50Pcs")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("hlb-ptc-btn-native")).click();
        Thread.sleep(2000);



        //driver.close();








    }
}
