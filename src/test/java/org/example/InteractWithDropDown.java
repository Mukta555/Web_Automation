package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.List;

public class InteractWithDropDown extends DriverSetUp{

    private static final Logger log = LoggerFactory.getLogger(InteractWithDropDown.class);

    @Test
    public void testDropDown() throws InterruptedException {

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement dropdown = browser.findElement(By.id("dropdown-class-example"));
        dropdown.click();
        Select select = new Select (dropdown);
        List<WebElement> options= select.getOptions();
        for (WebElement option:options){
            System.out.println(option.getText());
        }

        select.selectByVisibleText("Option2");
        Thread.sleep(2000);
       System.out.println(select.getFirstSelectedOption().getText());

       //select.selectByValue("Option3");
      // Thread.sleep(2000);
        //System.out.println(select.getFirstSelectedOption().getText());

        select.selectByIndex(1);
        Thread.sleep(2000);
        System.out.println(select.getFirstSelectedOption().getText());

    }

}
