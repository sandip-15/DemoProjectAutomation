package Popup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserpop_up {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
        // Initialize the EdgeDriver
        WebDriver driver = new EdgeDriver();
        // Navigate to a website
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(3000);

        try {
            // Find and click the "New Tab" link
            WebElement newTabLink = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
            newTabLink.click();
            

            // Switch to the new tab (window)
            String currentWindowHandle = driver.getWindowHandle();
            System.out.println(currentWindowHandle);
            
            for (String windowHandle : driver.getWindowHandles()) 
            {
                if (!windowHandle.equals(currentWindowHandle)) 
                {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }

            // Find and click the "Watch Free Course" link in the new tab
            WebElement freeCourseLink = driver.findElement(By.xpath("//a[@title='Contact me']"));
            freeCourseLink.click();
            Thread.sleep(3000);

            // Switch back to the original window
            driver.switchTo().window(currentWindowHandle);
            // Find and click the "New Window" link in the original window
            WebElement newWindowLink = driver.findElement(By.xpath("//input[@name='NewWindow']"));
            newWindowLink.click();

        } finally {
            // Close the browser
            driver.quit();
    }
		
		
		
}

}
