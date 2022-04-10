package com.selenium.Learning;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		
		// get page screenshot
		File firstSrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img1.png");
		FileHandler.copy(firstSrc, dest);

	
		//get element Screenshot
		WebElement ele = driver.findElement(By.id("home"));
		File eleSrc = ((TakesScreenshot) ele).getScreenshotAs(OutputType.FILE);
		File eledest = new File("./snaps/img2.png");
		FileHandler.copy(eleSrc, eledest);
		
		//get section Screenshot
		WebElement info = driver.findElement(By.xpath("(//*[@class='card-content'])[2]"));
		File eleSrc1 = ((TakesScreenshot) info).getScreenshotAs(OutputType.FILE);
		File eledest1 = new File("./snaps/img3.png");
		FileHandler.copy(eleSrc1, eledest1);
		
		//get FullPage
		String title = driver.getTitle();
		System.out.println("Page Title is :"+title);
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
		.takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(), "jpg", new File("./snaps/FullImage.jpg"));
		driver.quit();
		
		
		
		









	}

}
