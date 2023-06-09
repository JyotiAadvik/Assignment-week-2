package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.leafground.com/input.xhtml");
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[1]")).sendKeys("test");
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[2]")).clear();
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[2]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[3]"));
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[4]")).clear();
		System.out.println(driver.findElement(By.xpath("(//div[@class='col-12']/input)[5]")).getAttribute("value"));
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[6]")).sendKeys("test@testing.com",Keys.TAB);
	}

}
