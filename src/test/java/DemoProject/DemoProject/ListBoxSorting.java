//Write a script to print the content of list box  in sorted order

package DemoProject.DemoProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxSorting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//To click on create new account

		driver.findElement(By.xpath("//a[text()='Create new account']")).click(); 
		 
		Thread.sleep(3000);
		//step1

		//identify listbox and store in reference variable

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
	// Create a Select object to interact with the dropdown list
        Select select = new Select(month);
        
     // Get all the available options in the dropdown list
        List<WebElement> allOptions = select.getOptions();
        
     // Create an ArrayList to store the text of all options
        ArrayList<String> allText = new ArrayList<String>();
        
        // Loop through all options and extract their text
        for (int i = 0; i < allOptions.size(); i++) 
        {
            String text = allOptions.get(i).getText();
            allText.add(text); // Add the option text to the ArrayList
        }
     // Sort the list of option text alphabetically
        Collections.sort(allText);
        
        
        // Iterate through the sorted list and print each option
        for (String s : allText) {
            System.out.println(s);
        }
	}

}

 

/*
 *Consol Output
Apr
Aug
Dec
Feb
Jan
Jul
Jun
Mar
May
Nov
Oct
Sep
 */

