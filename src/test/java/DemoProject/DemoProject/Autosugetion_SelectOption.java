package DemoProject.DemoProject;
import java.util.List;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugetion_SelectOption 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.rediff.com/");
		
		//String expText = "redmi 9";
		
		WebDriver driver = new ChromeDriver(); //wait for 2sec
		Thread.sleep(2000); //open google page
		driver.get("https://www.google.com/"); //wait for 2sec
		driver.manage().window().maximize();
		Thread.sleep(2000);

		//Search redmi on search filed on google

		//driver.findElement(By.xpath("//input[@class='gLFyfgsfi']")).sendKeys("redmi");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("redmi");
		//wait for 2sec
		//Thread.sleep(2000);
		//identify autosugetion xpath by use absolute/relative xpath 

		List<WebElement> AllOptions = driver.findElements(By.xpath(".//*[@role='listbox']/li"));
		//System.out.println(AllOptions.size());
		
		//To print Autosugation select option 
		for(WebElement option: AllOptions) 
		{
			if(option.getText().equals("redmi")) {
				option.click();
				break;
			}


		} 


	}

}
