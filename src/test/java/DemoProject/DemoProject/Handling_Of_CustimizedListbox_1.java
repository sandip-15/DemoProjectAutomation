//@To move arrow at top and to move arrow at desired location in the customize listbox
package DemoProject.DemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By; import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Handling_Of_CustimizedListbox_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//To click on create new account

		driver.findElement(By.xpath("//a[text()='Create new account']")).click(); 
		 
		Thread.sleep(3000);
		//step1

		//identify listbox and store in reference variable

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		//step2

		//create object of Actions class which accept webdriver argument 
		Actions act = new Actions(driver);

		//step3

		//To click on identifing element 
		act.moveToElement(month).click().perform(); 
		
		//act.click(month).perform();
		//Thread.sleep(3000);
		
		//a) To move arrow at top

		//count how many option present in the listbox 
		//month field 12 options are present
		for(int i=1; i<=12; i++)
		{
		act.sendKeys(Keys.ARROW_UP).perform(); 
		}
		Thread.sleep(3000);

		//b)To move array at desire loacation 
		// for “Jun” option 
		for(int i=1; i<=6; i++)
		{
		act.sendKeys(Keys.ARROW_DOWN).perform(); 
		}


	}

}
