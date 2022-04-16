package com.selenium.Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDropDown {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		
		WebElement dropdown = driver.findElement(By.id("dropdown1"));
		
		Select select = new Select(dropdown);
		select.selectByIndex(3);
		
		Thread.sleep(3000);
		select.selectByVisibleText("Appium");
		
		Thread.sleep(3000);
		select.selectByValue("4");
		
		Thread.sleep(3000);
		
		List<WebElement> options = select.getOptions();
		int size = options.size();
		System.out.println("No of options are :"+size);
		
		Thread.sleep(3000);

		dropdown.sendKeys("Selenium");
		
		
		
		
		
		
	}

}
