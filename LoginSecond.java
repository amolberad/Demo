package parameter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginSecond {
    WebDriver driver;
    @Test
    public void myTest1(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        //Open Login Page for testing
        driver.manage().window().maximize();
        driver.get("http://billing.scriptinglogic.net/");
        WebElement user=driver.findElement(By.xpath("//input[@id='email']"));
        user.sendKeys("amolberad@gmail.com");
        WebElement  pass=driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("admin123");
        driver.findElement(By.xpath("//input[@name='btn_login']")).click();
        //driver.close();
    }
}
