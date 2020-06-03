package starbucks.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {


    public static void main(String[] args) throws InterruptedException {
        String chromeDriver ="webdriver.chrome.driver";
        String chromeDriverPath ="BrowserDriver/mac/chromedriver 8";
        String url ="https://www.starbucks.com/";

        //Set the properties for the driver
        System.setProperty(chromeDriver, chromeDriverPath);


        //Create object for the chrome driver
        WebDriver driver = new ChromeDriver();

        //Open the browser
        driver.get(url);

        //@Test :do maximization
        driver.navigate().to("https://www.starbucks.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/div[1]/div/div[2]/div[1]/ul/li[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"drinks\"]/div/div[4]/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#coffee-frappuccino > div > div:nth-child(1) > div > a")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/div[1]/div/div[2]/div[1]/ul/li[1]/a")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/nav/ul/li[4]/a")).click();
        Thread.sleep(2000);



















    }


}
