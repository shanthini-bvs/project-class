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

public class sample1 {
	public static void main(String[] args) throws IOException
 {
		File excelLoc =new File("\\Users\\91739\\eclipse-workspace\\Mavenproject\\Excel\\data.xlsx");
		
		FileInputStream  fin= new FileInputStream(excelLoc);
		
	    Workbook  w=new XSSFWorkbook(fin);
	    
	  Sheet s = w.getSheet("sheet1");
	//Row r = s.getRow(1);
	  
	  
	 // Cell c = r.getCell(1);
	  
	  //System.out.println(c);
	  //int rowno= s.getPhysicalNumberOfRows();
	 // System.out.println(rowno);
	 //int cellno = r.getPhysicalNumberOfCells();
	 // System.out.println(cellno);
	  
	  for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			
			System.out.println(c);
			CellType cellType = c.getCellType();
			switch (cellType) {
			case STRING:
				String value = c.getStringCellValue();
				System.out.println(value);
				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(c)) {
					Date date = c.getDateCellValue();
					SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
					String dvalue = sdf.format(date);
					System.out.println(dvalue);
				} else {
					
				double n = c.getNumericCellValue();
				long l=(long)n;
				
				
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);
				
				
				}
				break;
			default:
				break;
			}
			
			
			
			
			
			
			
			
			
		}
		  
		
	}
	  
	  
	}
	

}
