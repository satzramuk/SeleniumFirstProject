package com.selenium.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebdriverManagerDemo {

	public static WebDriver driver;
	@Test
	public static void ChromeBrowserDemo() {
		
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.id("")).click();
       
        
		
		
	}
	
	public static void FirefoxBrowserDemo() {
		
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
		
		
	}
	public static void IEBrowserDemo() {
		
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
		
		
	}
	
}
