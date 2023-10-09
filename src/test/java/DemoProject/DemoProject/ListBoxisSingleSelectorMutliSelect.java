//Write a script to print all the contents of the listbox

package DemoProject.DemoProject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxisSingleSelectorMutliSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//To click on create new account

		driver.findElement(By.xpath("//a[text()='Create new account']")).click(); 
		 
		Thread.sleep(3000);
		//step1

		//identify listbox and store in reference variable

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select select=new Select(month);
		
		List<WebElement> month1 = select.getOptions();
		int monthcount = month1.size();
		
		for(WebElement link:month1) {
			
			System.out.println(link.getText());
		}
	}

}
