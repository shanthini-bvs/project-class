package org.cts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
public static void main(String[] args)throws IOException{
			File excelLoc= new File("C:\\Users\\91739\\eclipse-workspace\\Mavenproject\\Excel\\new.xlsx");
			Workbook w=new XSSFWorkbook();
			Sheet s = w.createSheet("course");
			Row r = s.createRow(2);
			Cell c = r.createCell(2);
			c.setCellValue("Java");
		FileOutputStream fout=new FileOutputStream(excelLoc);
		w.write(fout);
		System.out.println("done");
		}
		}


