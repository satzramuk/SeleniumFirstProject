package com.selenium.Learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {
		
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
//		driver.findElement(By.id("accept")).click();
//		Thread.sleep(3000);
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		System.out.println("Alert text is :"+alerttext);
		alert.sendKeys("TestAutomation");
		System.out.println(alert.getText());
		alert.accept();
		
		//driver.quit();
		
		
	}

}
