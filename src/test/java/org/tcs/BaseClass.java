package org.tcs;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class BaseClass {
	public static WebDriver driver;
	public WebDriver launchBrowser(){
		 driver= new ChromeDriver();
		return driver;
		}
	
 public String getPageurl() {
	   String currentUrl = driver.getCurrentUrl();
	   return currentUrl;
	   }
   public void launchUrl(String url) {
	   driver.get(url);
	 }
   
   public String getText(WebElement element) {
	return element.getText();  
   }
   public String getpageTitle() {
		String title = driver.getTitle();
		return title;

	}
   public void getAttribute(WebElement element)
   
   {
	   element.getAttribute(null);
	   
   }
 public void maximizeewindow() {
	   driver.manage().window().maximize();
   }
   public void insertText(WebElement element,String data) {
		element.sendKeys(data);
		}   
   public void wait(WebDriver driver)
   {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
   }
    public void btnclick(WebElement element) {
	element.click();
	}
    
   public void switchto(WebDriver driver)
   {
	driver.switchTo();
	}
    public void gettext(WebElement element) {
    element.getText();
	   }
   public void movetoelement(Actions acc, WebElement element) {
	 acc.moveToElement(element);
}
  public void dragAnddrop(Actions acc, WebElement element) {
	acc.dragAndDrop(element, element);
	}
 public void contextClick(Actions acc, WebElement element) {
	acc.contextClick(element);
	}
	public void doubleClick(Actions acc,WebElement element) {
	acc.doubleClick(element);	
	}
public void Screenshot(WebElement element) {
	element.getScreenshotAs(null);
}	
public void SelectByvalue(Select s,String data) {
	s.selectByValue(data);
	}   
public void SelectByIndex(Select s,int index) {
	s.selectByIndex(index);
}
public void SelectByvisibleText(Select s,String data) {
	s.selectByVisibleText(data);
	
}
public void getOptions(Select s,WebElement element) {
	s.getOptions();
}
public void getAllselected(Select s,WebElement element) {
	s.getAllSelectedOptions();
} 
public void isMultiple(Select s) {
	s.isMultiple();
	}
public void deselect(Select s) {
	s.deselectAll();
}
public void deselesctByIndex(Select s,int index) {
	s.deselectByIndex(index);
}
public void deSelectByvisibleText(Select s,String data) {
	s.deselectByVisibleText(data);
}
public void deSelectByvalue(Select s,String data) {
	s.deselectByValue(data);
	}   
public void getFirstSelectedOptions(Select s,WebElement element) {
	s.getFirstSelectedOption();
	}   
public void getWindow(WebDriver driver,WebElement element){
	driver.getWindowHandle();
	}
public void getWindows(WebDriver driver,WebElement element){
	driver.getWindowHandles();
}
public void navigationto(WebDriver driver,String url) {
	driver.navigate().to(url);
}
public void navigationforward(WebDriver driver) {
	driver.navigate().forward();
	}
public void navigationback(WebDriver driver) {
	driver.navigate().back();
	}
public void navigateRefresh(WebDriver driver) {
	driver.navigate().refresh();
}
public void isDisplayed(WebElement element) {
	element.isDisplayed();
}
public void isEnabled(WebElement element) {
	element.isEnabled();
}
public void isSelected(WebElement element) {
	element.isSelected();
}
public void toinsert(JavascriptExecutor js,String key) {
js.executeScript(key);
}

public String getDataFromExcel(String loc,String sheetname,int rowNo, int cellNo) throws IOException {
	
	String value=null;
	File excelLoc =new File(loc);
	
	FileInputStream  fin= new FileInputStream(excelLoc);
	
    Workbook  w=new XSSFWorkbook(fin);
    
  Sheet s = w.getSheet(sheetname);
  
  Row r = s.getRow(rowNo);
  
  Cell c = r.getCell(cellNo);
 CellType cellType = c.getCellType();
 switch (cellType) {
case STRING:
	String value2 = c.getStringCellValue();
	System.out.println(value2);
	
	break;

case NUMERIC:
	if(DateUtil.isCellDateFormatted(c)) {
		Date date = c.getDateCellValue();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		String dvalue = sdf.format(date);
		System.out.println(dvalue);
		
	}else {
	double d = c.getNumericCellValue();
	long l= (long)d;
	String nvalue=String.valueOf(l);
	System.out.println(nvalue);
	}

	break;
	default:
		break;
 }
return value;

	
}

}




	



