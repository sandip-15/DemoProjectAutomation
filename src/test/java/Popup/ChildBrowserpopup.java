package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserpopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();

        // Initialize the EdgeDriver
        WebDriver driver = new EdgeDriver();

        // Navigate to a website
        driver.get("https://skpatro.github.io/demo/links/");
        
        Thread.sleep(2000); 
        
        //To click on new tab
        driver.findElement(By.xpath("(//input[@type='button'])[2]")).click(); //To wait for 2sec


        Thread.sleep(2000);

        Set<String> ids = driver.getWindowHandles(); //["mainpage","childwindow"]


        ArrayList<String> al = new ArrayList<String>(ids);
        //["mainpage","childwindow"]


        String childWindowids = al.get(1); 
        System.out.println(childWindowids);

        //switch selenium focus main page to that new tab driver.switchTo().window(childWindowids);
         
        //To click on Training from child window


        driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click(); 
        }


	}



