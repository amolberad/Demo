package allDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
    public static void main(String arg[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //create Account
        Thread.sleep(1000);
        WebElement fn=driver.findElement(By.name("firstname"));
        fn.sendKeys("Amol");
        Thread.sleep(1000);
        WebElement ln=driver.findElement((By.name("lastname")));
        ln.sendKeys("Berad");
        Thread.sleep(1000);
        WebElement email= driver.findElement(By.id("u_0_r"));
        email.sendKeys("amolberad@yahoo.com");

        // Date of Birth
        WebElement dd= driver.findElement(By.id("day"));
        Select setdd= new Select(dd);
        setdd.selectByValue("7");
        Thread.sleep(1000);
        WebElement mm= driver.findElement(By.id("month"));
        Select setmm= new Select(mm);
        setmm.selectByIndex(4);
        Thread.sleep(1000);
        WebElement yy= driver.findElement((By.id("year")));
        Select setyy= new Select(yy);
        setyy.selectByValue("1984");
        //Gender it shows 2 id before default Page and after entering data
        Thread.sleep(1000);
        WebElement fgender=driver.findElement(By.id("u_0_7"));
        fgender.click();
    }
}
