package com.OmayaBlog.Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OmayaBlog1 {

	WebDriver driver;
	@Test
	public void Firsttestcase() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.switchTo().frame("navbar-iframe");
		WebElement ele = driver.findElement(By.id("b-query"));
		ele.sendKeys("Girigowda");
		driver.switchTo().defaultContent();
		WebElement page = driver.findElement(By.xpath("//a[text()='Page One']"));
		System.out.println(page);
		System.out.println("it is successfull");
		driver.quit();



	}

	@Test
	public void secondtestcase() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.switchTo().frame("navbar-iframe");
		WebElement ele = driver.findElement(By.id("b-query"));
		ele.sendKeys("Girigowda");
		driver.switchTo().defaultContent();
		WebElement link = driver.findElement(By.xpath("//a[@id='selenium143']"));
		link.click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();



	}






















}
