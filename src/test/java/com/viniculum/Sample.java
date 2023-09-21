package com.viniculum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.viniculum.genericutility.FileUtlity;

public class Sample {
	
	@Test
	public void trialTest() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://vin-app-dev.vinreco.in/");
		driver.findElement(By.id("username")).sendKeys("pimtesting@gmail.com");
		driver.findElement(By.xpath("//button[@name='action']")).click();
		driver.findElement(By.name("password")).sendKeys("Root@123");
		driver.findElement(By.xpath("//button[@name='action' and @data-action-button-primary='true']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='align-self-center']/*[ @data-toggle='dropdown']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='dropdown-item secondary-font' and contains(text(),'Logout')]")).click();
		driver.quit();
	}

}
