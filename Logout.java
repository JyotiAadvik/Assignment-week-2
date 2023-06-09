package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.xpath("//label[text()='Email:']/following-sibling::input")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//label[text()='Password:']/following-sibling::input")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String Title =driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.xpath("//a[@href='https://acme-test.uipath.com/logout']")).click();
		driver.close();
		

	}

}
