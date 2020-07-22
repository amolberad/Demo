package allDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTagClassNameDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //open Login Page for testing
        driver.manage().window().maximize();
        driver.get("http://billing.scriptinglogic.net/index.php/sessions/login");
        //Enter username & Password and click to login into system
        WebElement txtuser = driver.findElement(By.className("form-control"));
        txtuser.sendKeys("amolujagare@gmail.com");

       WebElement txtpass = driver.findElement(By.xpath("//input[@placeholder='Password']"));
       txtpass.sendKeys("admin123");

        WebElement loginsubmit= driver.findElement(By.xpath("//input[@type='submit']"));
        loginsubmit.click();

       // WebElement linkforgot = driver.findElement(By.partialLinkText("forgot"));
       // linkforgot.click();

    }
}