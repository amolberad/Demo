package TestNgDemo.testngxml;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TesrNGBeforeAfterClass {
    WebDriver driver;
    @BeforeClass
    public void beforeMethod()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("BeforeClass");
    }
    @AfterClass
    public void afterMethod()
    {
        driver.close();
        System.out.println("AfterClass");
    }
    @Test
    public void openFB()
    {
        driver.get("http://www.facebook.com");
        System.out.println("Facebook");
    }
    @Test
    public void openGmail()
    {
        driver.get("http://www.gmail.com");
        System.out.println("Gmail");
    }
}
