package allDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
    public static void main(String args[])
    {
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");


}
}