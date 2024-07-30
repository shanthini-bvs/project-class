package org.tcs;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test {
	public static void main(String[] args)throws IOException, InterruptedException {
	
	BaseClass b =new BaseClass();
	
	b.launchBrowser();
	b.launchUrl("https://adactinhotelapp.com/");
	
	b.maximizeewindow();
	String url = b.getPageurl();
	System.out.println(url);
	
	b.getpageTitle();
	LoginPage lp= new LoginPage();
	WebElement txtuser = lp.getTxtUser();
	b.insertText(txtuser,"shanthinisurendar");
	WebElement txtpass = lp.getTxtpass();
	b.insertText(txtpass,"Saathvik@123");
	b.btnclick(lp.getBtnlogin());
	
	SearchHotel sh1= new SearchHotel();
	
	WebElement drpLocation= sh1.getDrpLocation();
	WebElement location = sh1.getLocation();
	b.btnclick(drpLocation);
	b.btnclick(location);
	
	WebElement hotels = sh1.getHotels();
	WebElement hotelName = sh1.getHotelName();
	b.btnclick(hotels);
	b.btnclick(hotelName);
	
	WebElement roomType = sh1.getRoomType();
	WebElement typeOfroom = sh1.getTypeOfroom();
	b.btnclick(roomType);
	b.btnclick(typeOfroom);
	
	WebElement noofRooms = sh1.getNoofRooms();
	WebElement roomNo = sh1.getRoomNo();
	b.btnclick(noofRooms);
	b.btnclick(roomNo);
	
	WebElement checkInDate = sh1.getCheckInDate();
	//WebElement indate= sh1.getCheckInDate();
	b.insertText(checkInDate, "24/07/2024");
	WebElement checkOutdate = sh1.getCheckOutdate();
	//WebElement outdate = sh1.getCheckOutdate();
	b.insertText(checkOutdate, "25/07/2024");
	
	WebElement adultsperRoom = sh1.getAdultsperRoom();
	WebElement adultCount = sh1.getAdultCount();
	b.btnclick(adultsperRoom);
	b.btnclick(adultCount);
	
	WebElement childperRoom = sh1.getChildperRoom();	
	WebElement childRoom = sh1.getChildRoom();
	b.btnclick(childperRoom);
	b.btnclick(childRoom);
	
	b.btnclick(sh1.getSearch());
	
	SelectHotel sh =new SelectHotel();
	WebElement rdo = sh.getRdo();
	b.btnclick(rdo);
	
	
	WebElement cont = sh.getCont();
	b.btnclick(cont);

	
	BookHotel bh=new BookHotel();
	
	WebElement firstname = bh.getFirstName();
	b.insertText(firstname,"shanthini");
	
	WebElement lastname = bh.getLastName();
	b.insertText(lastname, "surendar");
	
	
	WebElement address = bh.getAddress();
	b.insertText(address,"chennai");
	
	WebElement cardnumb = bh.getCreditCardNo();
	b.insertText(cardnumb, "1234123412341234");
	
	WebElement cctype = bh.getCreditCardtype();
	WebElement cardname =bh.getCreditCardName();
	b.btnclick(cctype);
	b.btnclick(cardname);
	
	WebElement expmo = bh.getMonth();
	WebElement cardmonth = bh.getExpMon();
	b.btnclick(expmo);
	b.btnclick(cardmonth);
	
	WebElement expyear = bh.getYear();
	WebElement cardyear = bh.getExpYear();
	b.btnclick(expyear);
	b.btnclick(cardyear);
	
	WebElement cvv = bh.getCvv();
	bh.insertText(cvv,"123");
	WebElement booknow = bh.getBookNow();
	b.btnclick(booknow);
	
	ConfirmBookking cb=new ConfirmBookking();
	WebElement orderno = cb.getOrderno();
String value=null;
String text = orderno.getAttribute(value);
System.out.println(text);
	
	}}