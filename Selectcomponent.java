package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectcomponent {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement dd = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select tool = new Select(dd);
		tool.selectByVisibleText("Selenium");
		WebElement findElement = driver.findElement(By.xpath("//label[text()='Select Country']"));
		Select country = new Select(findElement);
		country.selectByVisibleText("India");

	}

}

