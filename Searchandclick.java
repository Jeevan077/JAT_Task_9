package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchandclick {

	public static void main(String[] args) {
		// 3rd Question
		
		//Initialize the driver
		
		WebDriver driver=new ChromeDriver();
		
		//Opens the Chrome browser
		
		driver.get("https://www.chrome.com/");
				
		//Navigate to wikpedia website
		
		driver.navigate().to("https://www.wikipedia.org/");
		
		//Maximizes the browser window
		
		driver.manage().window().maximize();
		
		//Searches for the query 
		//Using id locator
		WebElement search=driver.findElement(By.id("searchInput"));
		
		//Searching for artificial Intelligence
		
		search.sendKeys("Artificial Intelligence");
		search.sendKeys(Keys.ENTER);
		
		
		//Clicking on the history section
		//Using name locator
		WebElement history=driver.findElement(By.className("skin--responsive"));
		history.click();
		
		//Printing the title of the section
		
		String sectiontitle =driver.getTitle();
		System.out.println("The title of the Navigated section is : "+sectiontitle);

	}
	//Output:
	//The title of the Navigated section is : Artificial intelligence - Wikipedia

}
