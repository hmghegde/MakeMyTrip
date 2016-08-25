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
         //driver.findElement(By.id("roundTripTab")).click();
         driver.findElement(By.id("login_dropOpenItem")).click();
         driver.findElement(By.id("username")).sendKeys("mahabaleshwarg@gmail.com");
         driver.findElement(By.id("password_text")).sendKeys("mableshwarg1");
         driver.findElement(By.id("login_btn")).click();
         
         driver.findElement(By.linkText("Flights")).click();
         
         driver.findElement(By.linkText(" Domestic ")).click();
         driver.findElement(By.id("one_way_button1")).click();
         driver.findElement(By.id("from_typeahead1")).sendKeys("Bangalore, India (BLR)");
         driver.findElement(By.id("to_typeahead1")).sendKeys("New Delhi, India (DEL))");
         driver.findElement(By.id("start_date_sec")).click();
         
    }



}