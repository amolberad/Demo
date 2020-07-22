package allDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GuruBankDemo {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // open http://www.demo.guru99.com/
        driver.get("http://demo.guru99.com/V1/index.php");

        WebElement loginuser=driver.findElement(By.name("uid"));
        loginuser.sendKeys("mngr267567");
        WebElement loginpass=driver.findElement(By.name("password"));
        loginpass.sendKeys("YjEvuha");

        WebElement loginbtn=driver.findElement(By.name("btnLogin"));
        loginbtn.click();
        // After Login Click New Customer
        WebElement newcust= driver.findElement(By.linkText("New Customer"));
        newcust.click();
        // waiting for link to get activated
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Add Record in New Customer Link
        WebElement cname=driver.findElement(By.name("name"));
        cname.sendKeys("Amol Berad");
        WebElement cdob=driver.findElement(By.name("dob"));
        cdob.sendKeys("04/07/1984");
        WebElement cadd=driver.findElement(By.name("addr"));
        cadd.sendKeys("138 Audumbar Niwas, Darewadi");
        WebElement ccity=driver.findElement(By.name("city"));
        ccity.sendKeys("Ahmednagar");
        WebElement cstate=driver.findElement(By.name("state"));
        cstate.sendKeys("Maharashtra");
        WebElement cpincode=driver.findElement(By.name("pinno"));
        cpincode.sendKeys("414002");
        WebElement cphone=driver.findElement(By.name("telephoneno"));
        cphone.sendKeys("7588170327");
        WebElement cemail=driver.findElement(By.name("emailid"));
        cemail.sendKeys("amolberad@yahoo.com");
// waiting for link to get activated
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement csubmit=driver.findElement(By.name("sub"));
        csubmit.click();
    }
}
