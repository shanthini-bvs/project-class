package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
	public BookHotel() {
	PageFactory.initElements(driver,this);
}
	@FindBy(id="first_name")
	private WebElement FirstName;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="address")
	private WebElement Address;
	
	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getCreditCardtype() {
		return CreditCardtype;
	}

	public WebElement getCreditCardName() {
		return CreditCardName;
	}

	public WebElement getMonth() {
		return Month;
	}

	public WebElement getExpMon() {
		return ExpMon;
	}

	public WebElement getYear() {
		return Year;
	}

	public WebElement getExpYear() {
		return ExpYear;
	}

	public WebElement getCvv() {
		return Cvv;
	}

	public WebElement getBookNow() {
		return BookNow;
	}
	@FindBy(id="cc_num")
	private WebElement CreditCardNo;
	
	@FindBy(id="cc_type")
	private WebElement CreditCardtype;
	
	@FindBy(xpath="//option[@value='AMEX']")
	private WebElement CreditCardName;
	
	@FindBy(id="cc_exp_month")
	private WebElement Month;
	
	@FindBy(xpath="//option[@value='9']")
	private WebElement ExpMon;
	
	@FindBy(id="cc_exp_year")
	private WebElement Year;
	
	@FindBy(xpath="//option[@value='2014']")
	private WebElement ExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement Cvv;
	
	@FindBy(id="book_now")
	private WebElement BookNow;
}