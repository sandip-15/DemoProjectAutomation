//Write a script to verify that email text box present in Facebook login page is empty? 
//Hint: get the value and check the length of it. Length should be 0.

package DemoProject.DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailTextBoxisEmpty {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement em=driver.findElement(By.id("email")); 
		String t = em.getAttribute("value"); 
		
		if(t.length()==0)
		{
		System.out.println("Textbox present in Facebook login page is empty");
		}
		else
		{
		System.out.println("Textbox present in Facebook login page is not empty");
		}
	}

}
