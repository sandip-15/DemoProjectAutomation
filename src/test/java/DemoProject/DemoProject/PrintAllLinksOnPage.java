// To print all the links present on the page
package DemoProject.DemoProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinksOnPage {

	public static void main(String[] args) {
		driver.get("https://www.facebook.com/");
		
		List<WebElement> alllinks=driver.findElements(By.xpath("//a"));
		
		for(int i=0;i<=alllinks.size();i++)
		{
			String Links=alllinks.get(i).getText();
			System.out.println(Links);
		}

	}

}
