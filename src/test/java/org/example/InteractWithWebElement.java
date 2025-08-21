package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractWithWebElement extends DriverSetUp{
    @Test
    public void interactWithElement() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement h1=  browser.findElement(By.tagName("h1"));
        String first_header = h1.getText();
        System.out.println(first_header);

        WebElement radio_option_1= browser.findElement(By.xpath("//input[@value='radio1']"));
        System.out.println("Display Status:" + radio_option_1.isDisplayed());
        System.out.println("Select Status:" + radio_option_1.isSelected());
        Thread.sleep(2000);
        radio_option_1.click();
        System.out.println("After click Status:" + radio_option_1.isSelected());
        Thread.sleep(2000);

        WebElement radio_option_2= browser.findElement(By.xpath("//input[@value='radio2']"));
        radio_option_2.click();
        System.out.println("After click another one select Status for radio button1:" + radio_option_1.isSelected());
        Thread.sleep(2000);

        WebElement autocomplete_input_box = browser.findElement(By.xpath("//input[@id='autocomplete']"));
        autocomplete_input_box.sendKeys("BD");
        Thread.sleep(2000);
        autocomplete_input_box.clear();
        Thread.sleep(2000);
        autocomplete_input_box.sendKeys("Bangladesh");
        Thread.sleep(2000);

       String id = autocomplete_input_box.getAttribute("id");
        System.out.println("ID: "+ id);

        String type = autocomplete_input_box.getAttribute("type");
        System.out.println("Type: "+ type);

        String placeholder= autocomplete_input_box.getAttribute("placeholder");
        System.out.println("Placeholder: "+ placeholder);

        String autocomplete = autocomplete_input_box.getAttribute("autocomplete");
        System.out.println("Autocomplete: "+ autocomplete);

        String text = autocomplete_input_box.getAttribute("text");
        System.out.println("Text: "+ text);


        WebElement openTab = browser.findElement(By.id("opentab"));
       String background_color = openTab.getCssValue("background-color");
       System.out.println(background_color);

       WebElement box =browser.findElement(By.id("displayed-text"));
       System.out.println("Before: "+ box.isDisplayed());
        Thread.sleep(3000);
       browser.findElement(By.id("hide-textbox")).click();
       System.out.println("After: "+ box.isDisplayed());
        Thread.sleep(3000);

       WebElement checkbox2 = browser.findElement(By.id("checkBoxOption2"));
       System.out.println("Is enabled: " + checkbox2.isEnabled());
       checkbox2.click();
       Thread.sleep(3000);



    }



}
