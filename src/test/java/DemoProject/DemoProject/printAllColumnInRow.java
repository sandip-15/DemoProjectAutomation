package DemoProject.DemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Pro.3. Print all Columns in a first row
public class printAllColumnInRow {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//to open created webtable page
		driver.get("https://www.w3schools.com/html/html_tables.asp"); 
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//to identify table

		List<WebElement> AllColumn = driver.findElements(By.xpath("//table[@id='customers']//tr[1]/th"));
		
		for(WebElement Column:AllColumn) {
		String text = Column.getText(); 
		System.out.println(text+ " "); 
		//System.out.println(Column.getText()+" ");

	}

}
}
