package TestNgDemo.testngxml;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBeforeAfterDemo {
    WebDriver driver;
   @BeforeMethod
   public void beforeMethod()
   {
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       System.out.println("BeforeMethod");
   }
   @AfterMethod
   public void afterMethod()
   {
       driver.close();
       System.out.println("AfterMethod");
   }
    @Test
    public void openFB()
    {
        driver.get("http://www.facebook.com");
        System.out.println("Facebook");
    }
    @Test
    public void openIbmrd()
    {
        driver.get("http://www.ibmrd.org");
        System.out.println("IBMRD");
    }
}
