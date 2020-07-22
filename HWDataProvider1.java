package TestNgDataDrivenFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sun.awt.geom.AreaOp;

public class HWDataProvider1 {
    @Test(dataProvider = "getDataForCall")
    public void requestCall(String nm,String email, String contact, String city) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://scriptinglogic.org/request-call-demo-class-online/");
        //System.out.println(nm+"\t"+email+"\t"+contact+"\t"+city);
        WebElement name=driver.findElement(By.xpath("//input[@placeholder='Name']"));
        name.sendKeys(nm);

        WebElement emailid=driver.findElement(By.xpath("//input[@placeholder='Email']"));
        emailid.sendKeys(email);

        WebElement phone=driver.findElement(By.xpath("//input[contains(@placeholder,'Contact no./ Whatsapp No.')]"));
        phone.sendKeys(contact);

        WebElement place=driver.findElement(By.xpath("//input[@placeholder='City']"));
        place.sendKeys(city);

        driver.findElement(By.xpath("//input[contains(@value,'Selenium')]")).click();
        driver.findElement(By.xpath("//input[@name='fields[send]']")).click();


        Thread.sleep(8000);
        driver.close();
    }
    @DataProvider
    public Object[][] getDataForCall()
    {
        Object data[][]=new Object[2][4];
        data[0][0]="Amol Berad";
        data[0][1]="amol.ibmrd@gmail.com";
        data[0][2]="7588170327";
        data[0][3]="Ahmednagar";

        data[1][0]="Atul Nimbalkar";
        data[1][1]="atul.ibmrd@gmail.com";
        data[1][2]="7588092515";
        data[1][3]="Pune";
        return data;
    }
}
