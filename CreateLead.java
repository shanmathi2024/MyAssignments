package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		WebElement element = driver.findElement(By.className("decorativeSubmit"));
		element.click();
		driver.findElement(By.partialLinkText("CRM")).click();
		//click on the leads
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shanmathi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		 driver.findElement(By.name("submitButton")).click();
		// Verify the title of the current web page
	     String actualTitle = driver.getTitle();
	     System.out.println("Actual Title: " + actualTitle);

	     if (actualTitle.contains("Create Lead | opentaps CRM")) {
	     System.out.println("Title verified: " + actualTitle);
	     } else {
	     System.out.println("Title mismatch");
	     driver.close();
	    
	}

	}}
