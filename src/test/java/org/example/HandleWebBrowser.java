package org.example;

//import com.sun.tools.javac.util.List;
import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class HandleWebBrowser extends DriverSetUp{
    @Test
    public void handleBrowser() throws InterruptedException {
        browser.get("https://autocare.com.bd/");
        Thread.sleep(2000);
        System.out.println(browser.getCurrentUrl());
        System.out.println(browser.getTitle());

        browser.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        browser.navigate().back();
        Thread.sleep(2000);

        browser.navigate().forward();
        Thread.sleep(2000);
//        browser.navigate().refresh();
//        Thread.sleep(2000);
//
//        browser.manage().window().maximize();
//        Thread.sleep(2000);
//        browser.manage().window().fullscreen();
//        Thread.sleep(2000);
//        browser.manage().window().minimize();
//        Thread.sleep(2000);
//        browser.manage().window().maximize();
//        Thread.sleep(2000);
//        browser.manage().window().fullscreen();
//        Thread.sleep(2000);

        browser.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        browser.get("https://mail.google.com/");
        Thread.sleep(2000);

        browser.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(2000);
        browser.get("https://www.shwapno.com/");
        Thread.sleep(2000);

       String currentWindowHandle= browser.getWindowHandle();
       System.out.println(currentWindowHandle);

       browser.switchTo().newWindow(WindowType.TAB);
       browser.navigate().to("https://www.facebook.com");
       Thread.sleep(2000);

       browser.switchTo().window(currentWindowHandle);
       Thread.sleep(5000);
        ArrayList<String> handles = new ArrayList<String>(browser.getWindowHandles());
        for (String handle:handles){
            browser.switchTo().window(handle);
            System.out.println(handle);
            System.out.println("We are currently at " + browser.getTitle() + "page");
            Thread.sleep(3000);
        }

    }
}
