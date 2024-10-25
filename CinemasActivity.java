package week2.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.cucumber.messages.types.Duration;

public class CinemasActivity {

	public static void main(String[] args) throws InterruptedException {
		
			// Initialize the driver and login to the pvr cinemas page
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.pvrcinemas.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Thread.sleep(3000);
			//) Click on Cinema under Quick Book
			driver.findElement(By.xpath("//span[text()='Cinema']")).click();
			//Select Your Cinema
			driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			WebElement e=driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']"));
			e.click();
			//Select Your Date as Tomorrow
			driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
			//Select Your Movie
			driver.findElement(By.xpath("(//span[text()='BLACK'])[2]")).click();
	  //Select Your Show Time
			WebElement e1=driver.findElement(By.xpath("//span[text()='04:15 PM']"));
			e1.click();
			
			//Click on Book Button
			driver.findElement(By.xpath("//span[text()='Book']")).click();
			Thread.sleep(5000);
			//Click Accept on Term and Condition
			driver.findElement(By.xpath("//button[text()='Accept']")).click();
			Thread.sleep(5000);
			//Click any one available seat
			driver.findElement(By.xpath("//span[@id='SL.SILVER|D:8']")).click();
			driver.findElement(By.xpath("//button[text()='Proceed']")).click();
					
			//Print the Seat info under book summary
			String seatNo = driver.findElement(By.xpath("//p[text()='D8']")).getText();
			System.out.println(seatNo);
			//Print the grand total under book summary
			String total = driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
			System.out.println(total);
	       //Click Proceed Button


			driver.findElement(By.xpath("//button[text()='Proceed']")).click();
			Thread.sleep(5000);
			//Close the popup
			driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
			String title = driver.getTitle();
			System.out.println(title);
			String ExpTitle = "PVR Cinemas";
			if (title.equals(ExpTitle)) {
				System.out.println("Title Matched");

			} else {
				System.out.println("Title not matched");
			}

		}

	}

