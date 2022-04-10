package com.selenium.Learning;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabHandling {
	
	public static WebDriver driver;	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldwindow = driver.getWindowHandle();
		
		//Requirement 1
//		WebElement firstelement = driver.findElement(By.xpath("//*[@id='home']"));
//		firstelement.click();
//		
//		Set<String> windowHandles = driver.getWindowHandles();
//		
//		for (String newwindow : windowHandles) {
//			
//			driver.switchTo().window(newwindow);
//			
//			
//		}
//		driver.manage().window().maximize();
//		WebElement editele = driver.findElement(By.xpath("//*[@alt='Edit / Text Fields']"));
//		editele.click();
//		driver.close();
//		
//		driver.switchTo().window(oldwindow);
//		firstelement.click();
//		
//		driver.close();
//		
//		
//      
//		
//		Set<String> windowHandles2 = driver.getWindowHandles();
//        for (String newwindow2 : windowHandles2) {
//			
//			driver.switchTo().window(newwindow2);
//			
//			
//		}
//        driver.close();
//     
		
		WebElement muliwindow = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
        
		muliwindow.click();
		
		int numberofopened = driver.getWindowHandles().size();
		System.out.println("Number of opened windows: "+numberofopened);
		
		WebElement execptwindow = driver.findElement(By.id("color"));
		
		execptwindow.click();
		
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for (String overallwindows : allwindows) {
			
			if(!overallwindows.equals(oldwindow)) {
				driver.switchTo().window(overallwindows);
				driver.close();
			}
			
		}
		
		
		
		
	}
	
	
	

}
