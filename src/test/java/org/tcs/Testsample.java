package org.tcs;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Testsample {
	
		public static void main(String[] args) throws IOException {
		
		BaseClass b =new BaseClass();
		
		b.launchBrowser();
		b.launchUrl("https://adactinhotelapp.com/");
		b.maximizeewindow();
		String url = b.getPageurl();
		System.out.println(url);
		LoginPage lp= new LoginPage();
		WebElement txtUser = lp.getTxtUser();
		b.insertText(txtUser, b.getDataFromExcel("C:\\Users\\91739\\eclipse-workspace\\Mavenproject\\Excel\\new.xlsx","course",0,0));
		}
		
}
