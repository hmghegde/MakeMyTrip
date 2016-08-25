package Projects.Google;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.WebDriverWait;

public class page {

    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-2.35.0\\chromedriver_win32_2.2\\chromedriver.exe");

         WebDriver driver = new FirefoxDriver(); 
         driver.get("https://www.makemytrip.com"); 
         driver.findElement(By.id("roundTripTab")).click();
         driver.findElement(By.id("login_dropOpenItem")).click();
         driver.findElement(By.id("username")).sendKeys("mahabaleshwarg@gmail.com");
         driver.findElement(By.id("password_text")).sendKeys("mableshwarg1");
         driver.findElement(By.id("login_btn")).click();
       /*  WebElement element = driver.findElement(By.name("q"));
         element.sendKeys("Usain Bolt!");
         element.submit();*/

         //driver.close();
    }



}