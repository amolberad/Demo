package parameter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginMultiURLUsingParameter {
    WebDriver driver;

    @Parameters({"browser","url"})
    @Test
    public void myTest1(String myBrowser, String myURL) throws InterruptedException {

        if (myBrowser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        if (myBrowser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        if (myBrowser.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
        if (myBrowser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        //Open Login Page for testing
        driver.manage().window().maximize();
        driver.get(myURL);
        WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
        user.sendKeys("amolujagare@gmail.com");
        WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
