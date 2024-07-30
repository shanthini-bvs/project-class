package org.cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Sample {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("shanthinisurendar");
		driver.findElement(By.name("password")).sendKeys("Saathvik@123");
		
		driver.findElement(By.id("login")).click();
		
		}
	

}
