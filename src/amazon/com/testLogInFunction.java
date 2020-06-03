package amazon.com;

import org.openqa.selenium.By;

public class testLogInFunction implements homePage {
    public static void createAccount() throws InterruptedException {
        //@Test Case:sign in
        driver.findElement(By.id("nav-link-accountList")).click();
        //@Test Case :email id
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("ssevmesh@gmail.com");
        Thread.sleep(2000);
        //@Test Case:click in email id
        driver.findElement(By.cssSelector("#continue")).click();
        //Test Case :pass the password
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("abcd1234");
        Thread.sleep(2000);
        //Get Title
        String title= driver.getTitle();
        System.out.println(title);

        //we are using link Text
        //driver.findElement(By.linkText("Gift Cards")).click();
       // Thread.sleep(2000);
        //we are using partial link Text
        // driver.findElement(By.partialLinkText("Gift")).click();


    }



}
