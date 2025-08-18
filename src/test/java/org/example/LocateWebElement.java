package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LocateWebElement extends DriverSetUp {
    @Test

    public void testLocateElement() throws InterruptedException {
        browser.get("https://autocare.com.bd/");

       WebElement searchInputBox;
      searchInputBox = browser.findElement(By.id("first_name"));
        //searchInputBox = browser.findElement(By.name("");
        //searchInputBox = browser.findElement(By.className("border-0 bg-transparent block focus:ring-0 font-medium placeholder:text-[#7A828A] placeholder:text-[15px] placeholder:font-inter placeholder:font-medium outline-none py-2 w-full"));

        //compound class name
       //searchInputBox =browser.findElement(By.tagName("input"));
        //searchInputBox = browser.findElement(By.cssSelector("input[id='first_name']"));
       // searchInputBox = browser.findElement(By.xpath("//input[@id='first_name']"));

        //searchInputBox = browser.findElement(By.cssSelector("input"));
        //searchInputBox = browser.findElement(By.xpath("//input"));

        //searchInputBox = browser.findElement(By.cssSelector("#first_name"));

        //searchInputBox = browser.findElement(By.cssSelector(".class-name"));



//        browser.findElement(By.linkText("Blog & News")).click();
//       Thread.sleep(5000);
//       browser.navigate().back();
//      browser.findElement(By.partialLinkText("Become")).click();
     searchInputBox.sendKeys("QA");
//        List<WebElement> all_links_elements= browser.findElements(By.xpath("//a"));
//        for (WebElement link_element:all_links_elements){
//            String text = link_element.getText();
//            System.out.println(text);
//        }

       Thread.sleep(5000);

}
}
