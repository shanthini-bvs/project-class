package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

import org.junit.Test;
public class Assert1 {
	@Test
	public void t1()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		Assert.assertTrue("verify url", driver.getCurrentUrl().contains("adactin"));
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys("shanthinisurendar");
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("Saathvik@123");
		Assert.assertEquals("Saathvik@123", txtpass.getAttribute("value"));
		}
	
}
