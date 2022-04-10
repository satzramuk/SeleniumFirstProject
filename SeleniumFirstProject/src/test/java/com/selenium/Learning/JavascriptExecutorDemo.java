package com.selenium.Learning;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		//jsExecutor.executeScript("document.getElementById('email').value='id';");
		//jsExecutor.executeScript("document.getElementsByName('login')[0].click()");
		//jsExecutor.executeScript("document.getElementById('ty_footer').scrollIntoView();");
		jsExecutor.executeScript("document.evaluate(\"//a[text()='Help']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.scrollIntoView();");
		
	}

}
