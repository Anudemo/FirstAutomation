package Demo.FirstAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangeHRMLogin {
WebDriver driver;

@Test
public void OpenBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	driver.findElement(By.id("searchSystemUser_userName")).sendKeys(" Admin");
	driver.findElement(By.id("searchBtn")).click();
	driver.findElement(By.linkText("Admin")).click();
	driver.findElement(By.linkText("AdminAlice")).click();
	driver.findElement(By.id("btnSave")).click();
	//driver.findElement(By.id("systemUser_userType")).click();
	driver.findElement(By.className("formInputText ac_input")).click();
	//driver.findElement(By.linkText("Welcome Irfan")).click();
	//driver.findElement(By.linkText("Logout")).click();
	
	
	
}
}