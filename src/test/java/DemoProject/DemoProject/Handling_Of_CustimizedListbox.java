//@To move one option upword, to move one option downword and to select option in the customize listbox

package DemoProject.DemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By; import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Handling_Of_CustimizedListbox {

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
		//act.moveToElement(month).click().perform(); 
		act.click(month).perform();
		Thread.sleep(3000);

		//step4

		//1. To move one option upword 
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000); 
		//act.sendKeys(Keys.ENTER).perform(); 

		//2. To move two option downword

		act.sendKeys(Keys.ARROW_DOWN).perform(); 

		Thread.sleep(3000); 
		
		act.sendKeys(Keys.ENTER).perform();


	}

}
