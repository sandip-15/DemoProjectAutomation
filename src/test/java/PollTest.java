import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PollTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WebDriverManager.edgedriver().setup();
//        // Initialize the EdgeDriver
//        WebDriver driver = new EdgeDriver();
		
		WebDriver driver = new ChromeDriver();
        // Navigate to a website
        driver.get("https://stage.eventscloud.com/ereg/ve2/index.php?eventid=379871");
        driver.manage().window().maximize();
      //  WebElement email=driver.findElement(By.xpath("(//input[@class='ant-input inputtext av-sm-paragraph'])[1]"));
     //   email.sendKeys("sandip@gmail.com");
      //  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sandip");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        
	}

}
