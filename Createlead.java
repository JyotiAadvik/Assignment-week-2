package week2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Createlead {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jyoti");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chaurasia");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jyoti");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@testing.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
		WebElement dd = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country = new Select(dd); 
		country.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());

	}

}
