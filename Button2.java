package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		// Ctrl+2 L for get Webelement
		WebElement dis = driver.findElement(By.xpath("//button[contains(@class, 'ui-button-text-only ui-state-disabled')]"));
		
		if (dis.isEnabled()) {
			
			System.out.println("This Button is Enabled");
			
		}

		else {
			
			System.out.println("This Button is Disabled");
		}
	 
		Point location = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
		System.out.println(location.x);
		System.out.println(driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background"));
	}

}






















