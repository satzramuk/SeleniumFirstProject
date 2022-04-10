package com.selenium.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameBasicDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		WebElement myFrame = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		driver.switchTo().frame(myFrame);
		driver.findElement(By.name("fname")).click();
		driver.findElement(By.name("fname")).sendKeys("Raju");
		driver.findElement(By.name("lname")).click();
		driver.findElement(By.name("lname")).sendKeys("Kumar");
		WebElement myFrame1 = driver.findElement(By.xpath("//*[@class='has-background-white']"));
		driver.switchTo().frame(myFrame1);//iframe1 to iframe2
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		WebElement myFrame2 = driver.findElement(By.xpath("//*[@class='has-background-white']"));
		driver.switchTo().frame(myFrame).switchTo().frame(myFrame1);
		driver.findElement(By.name("email")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("Kumar@gmail.com");
		//driver.quit();
		
		
	}

}
