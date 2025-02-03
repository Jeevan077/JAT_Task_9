package seleniumlocators;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firefoxbrowser {
	
	//1st Question

	public static void main(String[] args) {
		
		//Initialize the driver
		
		WebDriver driver =new ChromeDriver();
		
		//Open the website
		
		driver.get("https://www.mozilla.org/en-US/firefox/");
		
		//Maximize the browser window
		
		driver.manage().window().maximize();
		
		//Implicitly wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Navigating to google website
		
		driver.navigate().to("http://google.com");
		
		//Prints the current URL
		
		String CurrentURL=driver.getCurrentUrl();
		System.out.println("The current URL of the website is : "+CurrentURL);
		
		//Reloads the page
		
		driver.navigate().refresh();
		
		//Closes the browser
		
		driver.close();
		
		/*
		//Output:
		 
		 *The current URL of the website is : https://www.google.com/
		  
		*/
		
		
		
		
		

	}

}
