package com.selenium.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInitiateDemo {

	public static void main(String[] args) throws Exception   {
		

          System
 .setProperty("webdriver.chrome.driver","C://Users//Sathish//Desktop//Java Classes//BrowserDrivers//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		//ChromeDriver driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@id='username']")).click();
		driver.findElement(By.cssSelector("input[id='username']")).click();
		driver.findElement(By.id("user_email_login")).sendKeys("sathish@gamil.com");
		driver.findElement(By.className("menu section")).click();
		driver.findElement(By.linkText("click here")).click();
		driver.findElement(By.partialLinkText("click")).click();
		driver.findElement(By.name("name")).sendKeys("Ravi");
		
		
	}

}
