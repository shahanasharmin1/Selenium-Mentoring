package amazonWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testFindProducts  {
    public static void main(String[] args) throws InterruptedException {
        //Set the properties for the driver
        System.setProperty("webdriver.chrome.driver", "BrowserDriver/mac/chromedriver 8");
        //Create object for the chrome driver
        WebDriver driver = new ChromeDriver();
        //Open the browser
        driver.get("https://www.amazon.com");

        //@Test-1 :do maximization
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //find new release

        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(4)")).click();
        driver.findElement(By.cssSelector("#zg_left_col1 > div:nth-child(1) > div:nth-child(3) > div > div.a-section.a-spacing-none.p13n-asin > a > div.p13n-sc-truncated")).click();
        //add to cart

        driver.findElement(By.cssSelector("#add-to-cart-button")).click();


    }

    }


