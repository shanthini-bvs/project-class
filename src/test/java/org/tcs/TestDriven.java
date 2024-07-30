package org.tcs;

import org.junit.After;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDriven {
public static WebDriver driver;

@Before
public void before() {
	System.out.println(System.currentTimeMillis());
}
@AfterClass
public static void afterclass() {
	driver.quit();
}
@After
public void after()
{
	System.out.println(System.currentTimeMillis());
}
@Test
public void test()
{
WebElement username = driver.findElement(By.id("username"));

username.sendKeys("shanthinisurendar");

WebElement password = driver.findElement(By.id("password"));
password.sendKeys("Saathvik@123");


WebElement btnlogin = driver.findElement(By.name("login"));
btnlogin.click();

}
@BeforeClass

public static void beforeclass()
{
	driver= new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
}

}
