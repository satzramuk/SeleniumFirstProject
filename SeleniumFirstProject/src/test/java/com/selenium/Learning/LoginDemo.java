package com.selenium.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemo {
	
public static WebDriver driver;
	
	@Test(enabled=false)
	
	public static void ChromeBrowserDemo() throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tamilmatrimony.com");
        Thread.sleep(3000);
        driver.findElement(By.id("open_loginpp")).click();
        Thread.sleep(3000);
        //driver.findElement(By.id("ID")).clear();
        driver.findElement(By.id("ID")).sendKeys("abc");
        Thread.sleep(3000);
        WebElement name=driver.findElement(By.name("TEMPPASSWD1"));
        ((JavascriptExecutor)driver).executeAsyncScript("arguments[0].value='admin123'",name); 
        Thread.sleep(3000);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(By.xpath("//input[@value='LOGIN']"));
        executor.executeScript("arguments[0].click();", element);

        driver.quit();
	}
	
	@Test(enabled=true)
	
	public static void LoginMatri() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tamilmatrimony.com");
        Thread.sleep(3000);
        driver.findElement(By.id("open_loginpp")).click();
        Thread.sleep(3000);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("document.getElementById('ID').value='username';");
        Thread.sleep(3000);
		jsExecutor.executeScript("document.getElementsByName('TEMPPASSWD1')[0].value='password';");
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//input[@value='LOGIN']"));
        jsExecutor.executeScript("arguments[0].click();", element);
        driver.quit();

   


        
		
		
	}

}
