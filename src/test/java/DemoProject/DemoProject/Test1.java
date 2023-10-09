package DemoProject.DemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver(co);
//		driver.get("www.rediff.com");

		// WebDriverManager.edgedriver().setup();

	        // Initialize the EdgeDriver
	    //    WebDriver driver = new EdgeDriver();

	        // Navigate to a website
	    //    driver.get("https://www.rediff.com");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		
		String name=driver.findElement(By.xpath("//li[@class='business']")).getText();
		System.out.println(name);
		
		driver.get("https://stage.eventscloud.com/ereg/ve2/index.php?eventid=379871");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='normal_login_field1']")).sendKeys("sandip@gmail.com");
		driver.findElement(By.xpath("//input[@id='normal_login_field2']")).sendKeys("sandip");
		driver.findElement(By.xpath("//button[@class='ant-btn loginBtn av-btn-primary']")).click();
		Thread.sleep(6000);
		
		WebElement iframe =driver.findElement(By.xpath("//iframe[@id='lobby-iframe']"));
		driver.switchTo().frame(iframe);
		
	String name1=driver.findElement(By.xpath("//div[@class='ant-row']//div//h1")).getText();
	
	System.out.println(name1);
	}

}
 