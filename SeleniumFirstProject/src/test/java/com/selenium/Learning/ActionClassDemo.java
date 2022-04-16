package com.selenium.Learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassDemo {
	
	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		//driver.get("http://automationpractice.com/index.php");
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//		Thread.sleep(3000);
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		Thread.sleep(3000);
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		Thread.sleep(3000);
//		driver.findElement(By.id("btnLogin")).click();
//		
//		WebElement adminmenuoption = driver.findElement(By.id("menu_admin_viewAdminModule"));
//		WebElement organizationmenu = driver.findElement(By.id("menu_admin_Organization"));
//		WebElement locationmenu = driver.findElement(By.id("menu_admin_viewLocations"));
//		
//		actions.moveToElement(adminmenuoption)
//		.moveToElement(organizationmenu)
//		.moveToElement(locationmenu).click();
//		
		
//		WebElement womenMenuOption = driver.findElement(By.xpath("//a[text()='Women']"));
//		WebElement tshirtmenuoption = driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
//		
//		actions.moveToElement(womenMenuOption)
//		.moveToElement(tshirtmenuoption).click().build().perform();
		
		WebElement rightclickmenu = driver.findElement(By.xpath("//*[@class='context-menu-one btn btn-neutral']"));
		
		actions.contextClick(rightclickmenu).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Edit']")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		WebElement doubleclickeg = driver.findElement(By.id("example-code-simple-context-menu"));
		
		actions.doubleClick(doubleclickeg).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
