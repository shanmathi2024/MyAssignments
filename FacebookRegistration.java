package week2.day1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.cucumber.messages.types.Duration;
import java.time.Duration;

public class FacebookRegistration {
	public static void main(String[] args) {
		
	     ChromeDriver driver=new ChromeDriver();
	     driver.get("https://en-gb.facebook.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.findElement(By.partialLinkText("Create new account")).click();
         driver.findElement(By.name("firstname")).sendKeys("Shanmathi");
         driver.findElement(By.name("lastname")).sendKeys("Varun");
         driver.findElement(By.name("reg_email__")).sendKeys("9176072850");
         driver.findElement(By.name("reg_passwd__")).sendKeys("Sairam@11");
         WebElement sc=driver.findElement(By.id("day"));
         Select sourceSelect = new Select(sc);
         sourceSelect.selectByIndex(11);
         
         WebElement month=driver.findElement(By.id("month"));
         Select ss = new Select(month);
         ss.selectByVisibleText("May");
         
         WebElement year= driver.findElement(By.id("year"));
         Select select = new Select(year);
         select.selectByValue("1989");
         
         driver.findElement(By.id("sex")).click();
         
}}