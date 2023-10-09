package DemoProject.DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class printAllDataInTable_withHeader {

	public static void main(String[] args) {
	
		//Pro.6. Print all data in a table with header ;

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//to print all table use same logic of star pattern
		//use outer for loop for row and inner for loop for column
		//use generic xpath or runtime xpath
		//print row start from 2 for 1st some special scenario
		//to identify table then identify tr for row then to identify td for column
		
		int rowSize = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println(rowSize);
		int colSize1 = driver.findElements(By.xpath("//table[@id='customers']//tr/th")).size();
		System.out.println(colSize1);
		
	for (int i = 1; i <= rowSize; i++) 
	{
		for (int j = 1; j <= colSize1; j++) 
		{
		if (i==1) 
			{
			WebElement Alldata = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//th["+j+"]"));
			String text = Alldata.getText();
			System.out.print(text+" || ");
			}
		else
			{
			WebElement Alldata =driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td["+j+"]"));
			String text = Alldata.getText();
			System.out.print(text+" || "); 
		    }
	}
	System.out.println(); 
	}

   }
}


