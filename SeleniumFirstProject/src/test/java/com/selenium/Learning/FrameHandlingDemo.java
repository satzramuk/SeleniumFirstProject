package com.selenium.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandlingDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame"); 
		WebElement myFrame = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
					driver.switchTo().frame(myFrame);
					driver.findElement(By.name("fname")).sendKeys("Sathish");
					driver.findElement(By.name("lname")).sendKeys("Kumar");
		driver.switchTo().frame(0);
		driver.findElement(By.name("email")).sendKeys("email");

		//			driver.switchTo().parentFrame();
		//			driver.findElement(By.name("lname")).sendKeys("Kumar");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[text()=' Refer the video ']")).click();
	}

}

