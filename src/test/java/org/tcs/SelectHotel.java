package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {

			public SelectHotel() {
			PageFactory.initElements(driver,this);
		}
		@FindBy(id="radiobutton_0")
		private WebElement rdo;
		
		@FindBy(id="continue")
		private WebElement cont;

		public WebElement getRdo() {
			return rdo;
		}
		public WebElement getCont() {
			return cont;
		}

		
}
