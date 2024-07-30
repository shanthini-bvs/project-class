package org.cts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 extends ReusableClass{
	public static void main(String[] args) throws IOException {
WebDriver driver= new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(excelRead("sheet1",1,0));
		System.out.println(txtusername.getAttribute("value"));
		WebElement txtpassword = driver.findElement(By.name("password"));
		txtpassword.sendKeys(excelRead("sheet1",1,2));
		System.out.println(txtpassword.getAttribute("value"));
		driver.findElement(By.id("login")).click();
		
		
	}

}
