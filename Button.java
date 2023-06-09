package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.leafground.com/button.xhtml");
		driver.findElement(By.xpath("(//button[@type='button']/span)[1]")).click();
		System.out.println("The title is :" + driver.getTitle());
		if (driver.getTitle().contains("Dashboard")) {
			System.out.println("This is the title of webpage");
			
			
		}
		else {
			System.out.println("This is not the title of webpage");
		}
	
		System.out.println("The current URL is :" + driver.getCurrentUrl());
		System.out.println("The Source code is :"+ driver.getPageSource());
		
	}
	

}
