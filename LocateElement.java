package allDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocateElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    //open Login Page for testing
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net/");
    //Enter username & Password and click to login into system
        WebElement txtuser= driver.findElement(By.id("login-username"));
        txtuser.sendKeys("admin");

        WebElement txtpass= driver.findElement(By.id("login-password"));
        txtpass.sendKeys("admin");

        WebElement loginsubmit= driver.findElement(By.name("submit"));
        loginsubmit.click();

        // Click on Add Customer Link
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement addcust= driver.findElement(By.linkText("Add Customer"));
       // Thread.sleep(5000);

        addcust.click();
// Insert Record into Fields Provided in Add Customer
        WebElement custnm=driver.findElement(By.id("name"));
        custnm.sendKeys("Amol Berad");
        WebElement custadd= driver.findElement(By.name("address"));
        custadd.sendKeys("Darewadi, Ahmednagar");
        WebElement custcont1=driver.findElement(By.name("contact1"));
        custcont1.sendKeys("7588170327");
        WebElement custcont2= driver.findElement(By.name("contact2"));
        custcont2.sendKeys("9272511265");

        WebElement custaddbtn= driver.findElement(By.name("Submit"));
        custaddbtn.click();
        System.out.println("Testing Complited");
        driver.close();
    }
}
