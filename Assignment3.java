package allDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Assignment3 {
    public static void main(String arg[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/Software%20Testing/Assignment/amol.html");
        WebElement chek1= driver.findElement(By.id("check0"));
        chek1.click();
        Thread.sleep(2000);
        WebElement chek2= driver.findElement(By.id("check2"));
        chek2.click();
        Thread.sleep(2000);
        WebElement radio1= driver.findElement(By.id("rad1"));
        radio1.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
