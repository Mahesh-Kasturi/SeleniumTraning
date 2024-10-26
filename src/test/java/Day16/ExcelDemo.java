package Day16;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1"); // .getsheetAt(0); - by index
        int totalrows = sheet.getLastRowNum();
        int totalcells = sheet.getRow(1).getLastCellNum();
        System.out.println("Total no. of rows"+ totalrows);
        System.out.println("Total no. of cells"+ totalcells);
        for(int r=0; r<=totalrows; r++) {
        	XSSFRow rows = sheet.getRow(r);
        	
        	for(int c=0; c<totalcells; c++)
        	{
        		XSSFCell cells = rows.getCell(c);
        		System.out.println(cells.toString()+"\t");
        	}
        	System.out.println();
        }
        workbook.close();
        file.close();

	}

}
