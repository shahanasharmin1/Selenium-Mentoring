package costco.com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {
    public static void main(String[] args) throws InterruptedException {

        String chromeDriver = "webdriver.chrome.driver";
        String ChromeDriverPath = "BrowserDriver/mac/chromedriver 8";
        String url = "https://www.costco.com/";


        //setup driver
        System.setProperty("chromeDriver","ChromeDriverPath");

        //creating the object
        WebDriver driver = new ChromeDriver();

        //open the browser
        driver.get("url");

        //driver.navigate().to("https://www.costco.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("#footer-list > div > div:nth-child(3) > ul > li.footer-column-title > a")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#rn_SourceSearchField_9_SearchInput")).sendKeys("Membership");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"rn_SourceSearchButton_10_SubmitButton\"]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"rn_SourceResultListing_13_Content\"]/ul/li[1]/div[1]/h3/a")).click();
        Thread.sleep(2000);









    }




}
