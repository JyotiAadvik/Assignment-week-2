package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("jyoti");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("test");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("1234567890");
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("Test123#");
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(date);
		day.selectByVisibleText("2");
		Select month = new Select(date);
		month.selectByVisibleText("jul");
		Select year = new Select(date);
		year.selectByVisibleText("2022");
	    driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
		
		
		

	}

}
