package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadActivity {

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
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName'][1]")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName'][1]")).sendKeys("Shanmathi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName'][1]")).sendKeys("Varun");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Shan");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.name("description")).sendKeys("Test Manager");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mathi.varun11@gmail.com");
		WebElement element2 = driver.findElement((By.name("generalStateProvinceGeoId")));
		Select sc=new Select(element2);
		sc.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.className("tableheadtext")).click();
		WebElement descriptionfield = driver.findElement(By.name("description"));
		descriptionfield.clear();  
        WebElement importantnotefield = driver.findElement(By.name("importantNote"));
		importantnotefield.sendKeys("This is an important note.");
        driver.findElement(By.className("smallSubmit")).click();
        String t=driver.getTitle();
		System.out.println("The title of the resulting page is:"+t);
		driver.close();	
		
	}

}
