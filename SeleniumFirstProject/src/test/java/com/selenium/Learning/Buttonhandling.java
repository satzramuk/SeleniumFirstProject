package com.selenium.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttonhandling {


	public static WebDriver driver;


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");

		// Get the X & Y co-ordinates
		//		driver.findElementById("position").getLocation();
		WebElement ele = driver.findElement(By.id("position"));
		Point point = ele.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("x value is => "+x +" y value is => "+y);
		// Find the color of the button
		WebElement btnColor = driver.findElement(By.id("color"));
		String color = btnColor.getCssValue("background-color");
		System.out.println(color);

		// Find the height & width of the button
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		System.out.println("Width of element: "+rect.getWidth());
		System.out.println("Height of element: "+rect.getHeight());
		System.out.println("Point of element:"+rect.getPoint());
		Dimension dime = rect.getDimension();
		System.out.println("Dimension of element:"+dime);
		System.out.println("Dimension of element width:"+dime.getWidth());
		System.out.println("Dimension of element height:"+dime.getHeight());

		// Confirm button is disabled
		boolean isDis = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println("Button Status is : "+isDis);
		driver.quit();
		


	}

}
