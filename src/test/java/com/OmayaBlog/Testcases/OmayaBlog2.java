package com.OmayaBlog.Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OmayaBlog2 {
	
	WebDriver driver;
	@Test
	public void thirdtestcase() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement drop = driver.findElement(By.id("drop1"));
		Select sel=new Select(drop);
		sel.selectByVisibleText("doc 2");
		System.out.println("dropdown is selected");
		System.out.println("Hey its new sop line added by girigowda");
		System.out.println("i added one more sop statement");
		driver.quit();
		}
	
	
	@Test
	public void fourthtestcase() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement text = driver.findElement(By.xpath("//input[@name='q' and @type='text' and @class='gsc-input']"));
		text.sendKeys("Girigowda");
		System.out.println("fourth test case is passed");
		System.out.println("its new line added by girigowda");
		driver.quit();
		
	}
	}
