package JUnitDemoFiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitDemo {
    WebDriver driver;
    @Test  //
    public void myTest1(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //Open Login Page for testing
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
    }
    @Test  //
    public void myTest2(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //Open Login Page for testing
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com/");
    }
    @Test  //
    public void myTest3(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //Open Login Page for testing
        driver.manage().window().maximize();
        driver.get("http://www.gmail.com");
    }
}
