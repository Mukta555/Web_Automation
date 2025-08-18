package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class interactWithWebElement extends DriverSetUp{

    @Test
     public void interactWithWebElement() throws InterruptedException {
         browser.get("https://autocare.com.bd/products/category/audio-entertainment");
         WebElement p1 = browser.findElement(By.tagName("p"));
         String first_header = p1.getText();
         System.out.println(first_header);
         p1.click();
         Thread.sleep(5000);

         WebElement button_1 = browser.findElement(By.tagName("label"));
         System.out.println("Display status:" + button_1.isDisplayed());
        System.out.println("select status:" + button_1.isSelected());
        Thread.sleep(5000);
        button_1.click();
        System.out.println("After click Display status:" + button_1.isSelected());

     }


}
