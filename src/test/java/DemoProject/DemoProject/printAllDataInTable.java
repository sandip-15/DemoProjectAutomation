package DemoProject.DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Pro.5. Print all data in a table 

public class printAllDataInTable 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//to print all table use same logic of star pattern
		//use outer for loop for row and inner for loop for column
		//use generic xpath or runtime xpath
		//print row start from 2 for 1st some special scenario
		//to identify table then identify tr for row then to identify td for column

	for (int i = 2; i <= 7; i++) 
	{
		for (int j = 1; j <= 3; j++) 
		{
		WebElement Alldata = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td["+j+"]"));
		String text = Alldata.getText();
		System.out.print(text + " || "); 
		}
		System.out.println(); 

	} 
	

}

}
