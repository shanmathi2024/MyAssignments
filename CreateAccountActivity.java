package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountActivity {

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
		driver.findElement(By.id("accountName")).sendKeys("Mayasai");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
        Select industrySelect = new Select(driver.findElement(By.name("industryEnumId")));
        industrySelect.selectByVisibleText("Computer Software");

        // Select "S-Corporation" as ownership
        Select ownershipSelect = new Select(driver.findElement(By.name("ownershipEnumId")));
        ownershipSelect.selectByVisibleText("S-Corporation");

        // Select "Employee" as the source
        Select sourceSelect = new Select(driver.findElement(By.id("dataSourceId")));
        sourceSelect.selectByValue("LEAD_EMPLOYEE");

        // Select "eCommerce Site Internal Campaign" as the marketing campaign
        Select campaignSelect = new Select(driver.findElement(By.id("marketingCampaignId")));
        campaignSelect.selectByIndex(6); // Adjust index as necessary

        // Select "Texas" as the state/province
        Select stateSelect = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
        stateSelect.selectByValue("TX");

        // Click the "Create Account" button
        driver.findElement(By.className("smallSubmit")).click();

        // Verify that the account name is displayed correctly
        
        String displayedAccountName = driver.getTitle();

        if (displayedAccountName.contains("Account Details")) {
            System.out.println("Account created successfully: " + displayedAccountName);
        } else {
            System.out.println("Account creation failed: " + displayedAccountName);
            
        }
        driver.close();
        }}