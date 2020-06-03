package amazonWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchBoxForMovieTest {
    public static void main(String[] args) throws InterruptedException {

        //Set the properties for the driver
        System.setProperty("webdriver.chrome.driver", "BrowserDriver/mac/chromedriver 8");

        //Create object for the chrome driver
        WebDriver driver = new ChromeDriver();

        //Open the browser
        driver.get("https://www.amazon.com");

        //@Test :do maximization
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

       // click on search button and send the value
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("New Movies on prime");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
        Thread.sleep(2000);

        // add to wish list for prime free
        driver.findElement(By.cssSelector("#dv-action-box > div > div > div > div.abwJ5F.tFxybk._2LF_6p > div > span > form > button")).click();
        Thread.sleep(2000);

        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(2000);









    }
}
