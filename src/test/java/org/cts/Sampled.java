package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sampled {
	
public String excelRead(String sheetname,int rowNo,int cellNo) throws IOException {
	
	String value=null;
	File excelLoc =new File("\\Users\\91739\\eclipse-workspace\\Mavenproject\\Excel\\data.xlsx");
	
 FileInputStream  fin= new FileInputStream(excelLoc);
	
  Workbook  w=new XSSFWorkbook(fin);
    
  Sheet s = w.getSheet(sheetname);
  
  Row r = s.getRow(rowNo);
  
  Cell c = r.getCell(cellNo);
  
  
 
  CellType cellType = c.getCellType();
 switch (cellType)
 {
case STRING:
	 value = c.getStringCellValue();
	
	
	
	
	break;
case NUMERIC:
	if(DateUtil.isCellDateFormatted(c))
	{
		Date date = c.getDateCellValue();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		
		value = sdf.format(date);		
	}
	else {
		
		double d = c.getNumericCellValue();
		long l=(long)d;
		
		 value = String.valueOf(l);
		 
		 }
		
		
		
default:
	break;
}
return value;
}
}
