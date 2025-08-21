package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleWebAlert extends DriverSetUp {

    @Test
    public void testWebElement() throws InterruptedException {


        browser.get("https://the-internet.herokuapp.com/javascript_alerts");
        browser.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Alert alert =browser.switchTo().alert();
        String text= alert.getText();
        System.out.println(text);
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);


    browser.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
         text= alert.getText();
         System.out.println(text);
         Thread.sleep(3000);
         alert.dismiss();
         Thread.sleep(3000);

         browser.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
         System.out.println(alert.getText());
        Thread.sleep(3000);
        alert.sendKeys("Hello Qa");
        Thread.sleep(5000);
       alert.accept();
        Thread.sleep(3000);


    }
}
