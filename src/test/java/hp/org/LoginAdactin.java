package hp.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginAdactin {
	public  LoginAdactin() {
		PageFactory.initElements(driver,this);
		}
private WebElement txtUser;
private WebElement txtpass;
private WebElement btnlogin;

public WebElement getTxtUser() {
	return txtUser;
}


public WebElement getTxtpass() {
	return txtpass;
}

public WebElement getBtnlogin() {
	return btnlogin;
}

}
	
