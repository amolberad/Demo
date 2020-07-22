package allDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.ibmrd.org");
      Thread.sleep(2000);
        System.out.print(driver.getTitle()) ;
        System.out.print(driver.getCurrentUrl());
      //  driver.quit();
    }

}
