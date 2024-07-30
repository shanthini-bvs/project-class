package org.tcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver,this);
	}
@FindBy(name="location")
private WebElement drpLocation;

@FindBy(xpath="//option[@value='Melbourne']")
private WebElement Location;

@FindBy(id="hotels")
private WebElement Hotels;

@FindBy(xpath="//option[@value='Hotel Hervey']")
private WebElement HotelName;

@FindBy(id="room_type")
private WebElement RoomType;

@FindBy(xpath="//option[@value='Deluxe']")
private WebElement TypeOfroom;

@FindBy(id="room_nos")
private WebElement NoofRooms;

@FindBy(xpath="(//option[@value='4'])[1]")
private WebElement RoomNo;

@FindBy(id="datepick_in")
private WebElement CheckIndate;

@FindBy(id="datepick_out")
private WebElement CheckOutdate;

@FindBy(id="adult_room")
private WebElement AdultsperRoom;

@FindBy(xpath="(//option[@value='4'])[2]")
private WebElement AdultCount;

@FindBy(id="child_room")
private WebElement ChildperRoom;

@FindBy(xpath="(//option[@value='1'])[3]")
private WebElement ChildRoom;

@FindBy(id="Submit")
private WebElement Search;

public WebElement getSearch() {
	return Search;
}
public WebElement getHotels() {
	return Hotels;
}
public WebElement getRoomType() {
	return RoomType;
}
public WebElement getNoofRooms() {
	return NoofRooms;
}
public WebElement getCheckInDate() {
	return CheckIndate;
}
public WebElement getCheckOutdate() {
	return CheckOutdate;
}
public WebElement getAdultsperRoom() {
	return AdultsperRoom;
}
public WebElement getChildperRoom() {
	return ChildperRoom;
}
public WebElement getDrpLocation() {
return drpLocation;
}
public WebElement getRoomNo() {
	return RoomNo;
}
public WebElement getAdultCount() {
	return AdultCount;
}
public WebElement getChildRoom() {
	return ChildRoom;
}public WebElement getLocation() {
	return Location;
}

public WebElement getHotelName() {
	return HotelName;
}

public WebElement getTypeOfroom() {
	return TypeOfroom;
}

}
