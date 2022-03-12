package com.selenium.Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitDemo {

	public static WebDriver driver;
	@Test(enabled=true)
	public static void ChromeBrowserDemo() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html?m=1");
		
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		WebElement firstResult = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='WebDriver']")));		
		
		
		//String text = driver.findElement(By.xpath("//*[text()='WebDriver']")).getText();
		
		
		System.out.println(firstResult.getText());



	}

	@Test(enabled=false)
	public static void ChromeBrowserDemo2() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/ncr");
		driver.findElement(By.name("q")).sendKeys("scrolltest" +Keys.ENTER);
		
		
		
		WebElement firstResult = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));		
		System.out.println(firstResult.getText());
		driver.quit();
		
		



	}


}
