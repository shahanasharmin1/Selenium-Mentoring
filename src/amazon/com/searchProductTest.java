package amazon.com;

import org.openqa.selenium.By;

public class searchProductTest implements homePage{
    public static void searchAndADD() throws InterruptedException {
        Thread.sleep(2000);
        //Test Case : Search product and add it in the cart
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("disposable face mask");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        Thread.sleep(2000);
        driver.getTitle();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.findElement(By.linkText("Modenna Face Mask Disposable Blue 50Pcs")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("hlb-ptc-btn-native")).click();
        Thread.sleep(2000);

        //Test Case :Search in the search box and go one step back
       // public static void goBackStep()throw InterruptedException{
            Thread.sleep(2000);
            //driver.findElement()
            Thread.sleep(2000);
           // driver.findElement()
            Thread.sleep(2000);
            //driver.findElement
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().refresh();

        }

    }

