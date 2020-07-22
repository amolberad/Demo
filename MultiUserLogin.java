package TestNgDataDrivenFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiUserLogin {

    @Test(dataProvider = "getData")
    public void multiUser(String userdata, String passdata) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://billing.scriptinglogic.net/");
        WebElement user=driver.findElement(By.xpath("//input[@id='email']"));
        user.sendKeys(userdata);
        WebElement  pass=driver.findElement(By.xpath("//input[@id='password']"));
        pass.sendKeys(passdata);
        driver.findElement(By.xpath("//input[@name='btn_login']")).click();
        Thread.sleep(2000);
        driver.close();
    }
    @DataProvider
    public Object[][] getData()
    {
        Object data[][]=new Object[3][2];
        data[0][0]="amolujagare@gmail.com";
        data[0][1]="admin123";

        data[1][0]="amolberad@gmail.com";
        data[1][1]="admin123";

        data[2][0]="";
        data[2][1]="";
        return data;
    }
}
