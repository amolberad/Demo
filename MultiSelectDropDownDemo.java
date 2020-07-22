package allDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownDemo {
    public static void main(String arg[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("file:///D:/Software%20Testing/Assignment/amol.html");
        WebElement mydrop1=driver.findElement(By.id("drop1"));
        Select setdrop1 =new Select(mydrop1);
        Thread.sleep(1000);
        //setdrop1.selectByIndex(2);
        //setdrop1.selectByVisibleText("");
        setdrop1.selectByValue("1");
        WebElement mydrop2=driver.findElement(By.id("drop2"));
        Select setdrop2 =new Select(mydrop2);
        Thread.sleep(1000);
        setdrop2.selectByIndex(0);
        Thread.sleep(1000);
        setdrop2.selectByIndex(1);
        Thread.sleep(1000);
        setdrop2.selectByIndex(3);
        Thread.sleep(1000);
        setdrop2.selectByVisibleText("Noida");
        setdrop2.deselectByVisibleText("Pune");
        Thread.sleep(1000);
        setdrop2.deselectAll();
    }
}
