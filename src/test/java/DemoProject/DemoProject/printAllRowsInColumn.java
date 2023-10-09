package DemoProject.DemoProject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAllRowsInColumn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//to open created webtable page
		driver.get("https://www.w3schools.com/html/html_tables.asp"); 
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//identify single element header
		WebElement ele = driver.findElement(By.xpath("//table[@id='customers']//th[1]"));
		String texts = ele.getText(); System.out.println(texts);
		//identify table

		List<WebElement> AllRows = driver.findElements(By.xpath("//table[@id='customers']//td[1]"));
		
		for(WebElement row:AllRows) {
			String text = row.getText();

			System.out.println(text); }

	}

}
