package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

    public void scrollWebPage(WebDriver driver,int scrollValue,String locateElement) throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //Scroll down
        js.executeScript("window.scrollBy(0,"+scrollValue+")");
        //Scroll up
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-200)");
        Thread.sleep(3000);
        //Scroll to a specific element
        WebElement element = driver.findElement(By.xpath(locateElement));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        //Wait to observe the scrolling action
        Thread.sleep(3000);


    }

    public void scrollWebPage2(WebDriver driver,String locateElement) throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor) driver;

        Thread.sleep(3000);
        //Scroll to a specific element
        WebElement element = driver.findElement(By.xpath(locateElement));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        //Wait to observe the scrolling action
        Thread.sleep(3000);
    }

    public void scrollWebPage3(WebDriver driver,int scrollValue) throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //Scroll down
        js.executeScript("window.scrollBy(0,"+scrollValue+")");
        //Scroll up
        Thread.sleep(3000);

    }


    public static void main(String[] arg) throws InterruptedException {
        ChromeDriver driver=new ChromeDriver();

        // Maximize the window and navigate to the registration page
        driver.manage().window().maximize();
        driver.get("https://mvnrepository.com/");
        Thread.sleep(2000);
        /*
        JavascriptExecutor js=(JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-300)");
        Thread.sleep(2000);

         */
        Scroll scrl=new Scroll();
        scrl.scrollWebPage(driver,500,"//*[normalize-space()='Top Categories']");
        //scrl.scrollWebPage(driver);
    }
}
