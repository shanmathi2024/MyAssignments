package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		WebElement element = driver.findElement(By.className("decorativeSubmit"));
		element.click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Varun");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");

        driver.findElement(By.id("numberEmployees")).sendKeys("20");
        driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
        driver.findElement(By.className("smallSubmit")).click();

// Verify the title of the current web page
     String actualTitle = driver.getTitle();
     System.out.println("Actual Title: " + actualTitle);

     if (actualTitle.contains("Create Lead | opentaps CRM")) {
     System.out.println("Title verified: " + actualTitle);
     } else {
     System.out.println("Title mismatch");
     driver.close();
    
}

}
	
}