//Pro.1. To get reviews count from flipkart package Dynammic_Element; 

package DemoProject.DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class getReviewsCountFromFilpkart 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver(); //To wait for 3sec
		Thread.sleep(3000); driver.manage().window().maximize();

		//To enter url / open flipkart 
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);
		//To click on close button

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); 
		Thread.sleep(2000);
		//To identify search field and enter in the field redmi Note 9 pro
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi Note 9 pro");
		Thread.sleep(2000);

		//To identify search button and click on that button

		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

		Thread.sleep(2000);

		//To identify mobile parent convert 1 matching and then jump to the child review convert 1 matching

		WebElement reviews = driver.findElement(By.xpath("(//div[@class='_3pLy-c row'][1]//span)[6]"));

		Thread.sleep(2000);

		//To get review count from redmi Note 9 pro mobile 
		String text = reviews.getText();

		System.out.println(text); 
		}

	}



	


