package allDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class GuruAddRecrordXpath {
    public static void main(String[] args)

    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // open http://www.demo.guru99.com/
        driver.get("http://demo.guru99.com/V1/index.php");

        WebElement loginuser=driver.findElement(By.xpath("//input[@name='uid']"));
        loginuser.sendKeys("mngr267567");
        WebElement loginpass=driver.findElement(By.xpath("//input[@name='password']"));
        loginpass.sendKeys("YjEvuha");

        WebElement loginbtn=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        loginbtn.click();
        // After Login Click New Customer
        WebElement newcust= driver.findElement(By.xpath("//a[contains(text(),'New Customer')]"));
        newcust.click();
        // waiting for link to get activated
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Add Record in New Customer Link
        WebElement cname=driver.findElement(By.xpath("//input[@name='name']"));
        cname.sendKeys("Amol Berad");
        WebElement cgender=driver.findElement(By.xpath("//tr[5]//td[2]//input[1]"));
        cgender.click();
        WebElement cdob=driver.findElement(By.xpath("//input[@id='dob']"));
        cdob.sendKeys("04/07/1984");
        WebElement cadd=driver.findElement(By.xpath("//textarea[@name='addr']"));
        cadd.sendKeys("138 Audumbar Niwas, Darewadi");
        WebElement ccity=driver.findElement(By.xpath("//input[@name='city']"));
        ccity.sendKeys("Ahmednagar");
        WebElement cstate=driver.findElement(By.xpath("//input[@name='state']"));
        cstate.sendKeys("Maharashtra");
        WebElement cpincode=driver.findElement(By.xpath("//input[@name='pinno']"));
        cpincode.sendKeys("414002");
        WebElement cphone=driver.findElement(By.xpath("//input[@name='telephoneno']"));
        cphone.sendKeys("7588170327");
        WebElement cemail=driver.findElement(By.xpath("//input[@name='emailid']"));
        cemail.sendKeys("amolberad@yahoo.com");
        // Click to Add Record
        driver.findElement(By.xpath("//input[@name='sub']")).click();

    }

}
