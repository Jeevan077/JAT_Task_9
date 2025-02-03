package seleniumlocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifytitle {

	public static void main(String[] args) {
		// 2nd Question
		
		//Initialize the driver
		
		WebDriver driver=new ChromeDriver();
		
		//Opens the Chrome browser
		
		driver.get("https://www.chrome.com/");
		
		//Navigate to Demoblaze website
		
		driver.navigate().to("https://www.demoblaze.com/");
		
		//Maximizes the website
		
		driver.manage().window().maximize();
		
		// Checking the title

		String expectedTitle="STORE";
		String actualTitle=driver.getTitle();
		
	   //Using if else to check the condition matches or not
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Page Landed on Correct Website");
		}
		else
		{
			System.out.println("Page Not Landed on Correct Website");
		}
		
		
		//OUTPUT:
		//Page Landed on Correct Website
		
		
		
		
		
	}

}
