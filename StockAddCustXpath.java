package allDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class StockAddCustXpath {
    public static void main(String args[])
    {
        //open browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net");

        WebElement txtUserName= driver.findElement(By.xpath ("//input[@id='login-username']"));
        txtUserName.sendKeys("admin");

        WebElement txtPassName= driver.findElement(By.xpath ("//input[@id='login-password']"));
        txtPassName.sendKeys("admin");

        WebElement btn= driver.findElement(By.xpath ("//input[@name='submit']"));
        btn.click();

        // Click on Add Customer Link
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Add Customer")).click();

        // Insert Record into Fields Provided in Add Customer

        WebElement custnm=driver.findElement(By.xpath("//input[@id='name']"));
        custnm.sendKeys("Mr Amol Berad");
        WebElement custadd= driver.findElement(By.xpath("//textarea[@placeholder='ENTER YOUR ADDRESS']"));
        custadd.sendKeys("Darewadi, Ahmednagar");
        WebElement custcont1=driver.findElement(By.xpath("//input[@id='buyingrate']"));
        custcont1.sendKeys("917588170327");
        WebElement custcont2= driver.findElement(By.xpath("//input[@id='sellingrate']"));
        custcont2.sendKeys("919272511265");

        driver.findElement(By.xpath("//input[@name='Submit']")).click();

        System.out.println("Testing Complited");
        //driver.close();
    }
}
