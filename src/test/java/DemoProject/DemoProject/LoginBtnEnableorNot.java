package DemoProject.DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginBtnEnableorNot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement log=driver.findElement(By.xpath("//button[@name='login']"));
		Thread.sleep(3000);
		if(log.isEnabled())
		{
		System.out.println("Login button is enabled");
		}
		else
		{
		System.out.println("Login button is disabled");
		}

	}

}
