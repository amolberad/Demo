package allDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        String URL="https:/login.yahoo.com/";
        driver.navigate().to(URL);
              driver.findElement(By.id("login-username")).
                sendKeys("amolberad@yahoo.com");
              driver.findElement(By.id("login-signin")).click();


    }

}
