package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppTest extends DriverSetUp {

    @Test
    public  void testGooglePageTitle(){

        //load "https://www.google.com" webpage
        browser.get("https://autocare.com.bd/");
        //get pageTitle
       String pageTitle = browser.getTitle();
       System.out.println("https://autocare.com.bd/");
       //validate title with text "Google"
        Assert.assertEquals(pageTitle,"Autocare");
    }

    @Test
    public  void testGooglePageUrl(){
        //load "https://www.google.com" webpage
        browser.get("https://autocare.com.bd/");
        //get pageTitle
        String pageUrl = browser.getCurrentUrl();
        System.out.println("https://autocare.com.bd/");
        //validate title with text "Google"
        Assert.assertEquals(pageUrl,"https://autocare.com.bd/");

    }


}
