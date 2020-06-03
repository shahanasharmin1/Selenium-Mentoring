package amazonWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchTest {


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

            //Test : best seller
            driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();
            Thread.sleep(2000);

            driver.findElement(By.cssSelector("#zg_browseRoot > ul > li:nth-child(1) > a")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@id=\"zg-ordered-list\"]/li[14]/span/div/span/a/div")).click();
            Thread.sleep(2000);

            driver.findElement(By.cssSelector("#variation_color_name > div > span")).click();
            Thread.sleep(2000);

            //driver.findElement(By.cssSelector("#wishListMainButton-announce")).click();
            //Thread.sleep(2000);


            driver.navigate().back();

            //Test Whole food

            driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)")).click();
            Thread.sleep(2000);

            //driver.findElement(By.cssSelector("#contentGrid_394474 > div > div:nth-child(2) > div:nth-child(1) > div > div > a > img")).click();
            //Thread.sleep(2000);

            driver.navigate().back();

            Thread.sleep(2000);

            driver.navigate().refresh();

            Thread.sleep(2000);

            //Test for buying gift

            driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(5)")).click();
            Thread.sleep(2000);

            driver.findElement(By.cssSelector("#notification-provider > div > div > div:nth-child(1) > div > a:nth-child(2) > div > div.sc-gqjmRU.farDCw > img")).click();
            Thread.sleep(2000);

            driver.findElement(By.cssSelector("#notification-provider > div > div:nth-child(2) > div > div > div:nth-child(2) > div > div.sc-1eu8snt-0.kSoqWd > ul > li:nth-child(11) > button")).click();
            Thread.sleep(2000);

            driver.findElement(By.cssSelector("#gcx-gf-section-0 > div > section > div.sc-kpOJdX.gHyGEC > figure > div > div > a > div > div.sc-bdVaJa.fipfBn > span")).click();
            Thread.sleep(2000);






















        }
    }
