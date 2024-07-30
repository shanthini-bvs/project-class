package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmBookking extends BaseClass {
		public ConfirmBookking()  {
			PageFactory.initElements(driver,this);
		}
			public WebElement getOrderno() {
			return orderno;
		}

		@FindBy(id="order_no")
		private WebElement orderno;
		
}

