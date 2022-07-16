package week2.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajith");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("A k");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Marketing");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Description field....");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ajithak29698@gmail.com");
	WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select drop = new Select(state);
	drop.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
	//step 16 resulting title page...
	System.out.println(driver.getTitle());
	
	}

}
