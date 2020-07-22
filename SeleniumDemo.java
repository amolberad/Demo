package allDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String args[])
    {
       //open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net");

        WebElement txtUserName= driver.findElement(By.id ("login-username"));
        txtUserName.sendKeys("admin");

        WebElement txtPassName= driver.findElement(By.id ("login-password"));
        txtPassName.sendKeys("admin");

        WebElement btn= driver.findElement(By.name ("submit"));
        btn.click();

      //  String expected= "POSNIC - Dashboard");
    }

}

