package JUnitDemoFiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitBeforeAfterClass {
    static WebDriver driver;
    @BeforeClass
    public static void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();      }
    @AfterClass
    public static void afterTest()
    {
        driver.close();      }
    @Test  //
    public void myTest1(){
        driver.get("http://stock.scriptinglogic.net/");      }
    @Test  //
    public void myTest2(){
        driver.get("http://www.facebook.com/");        }
    @Test  //
    public void myTest3(){
        driver.get("http://www.gmail.com");
    }

}
