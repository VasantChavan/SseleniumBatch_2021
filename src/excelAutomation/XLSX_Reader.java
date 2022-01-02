package excelAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class XLSX_Reader {

	public static void main(String[] args) {

		try {
			File fs = new File("C:\\Users\\HP\\Desktop\\DataSheet.xlsx");
			FileInputStream fins = new FileInputStream(fs);
			XSSFWorkbook workbook = new XSSFWorkbook(fins);
			//XSSFSheet sheet = workbook.getSheet("Sheet1"); getting sheet based on sheet name
			XSSFSheet sheet = workbook.getSheetAt(0); // getting sheet based on sheet index
					
			String row_00 = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(row_00);
			
			String row_01 = sheet.getRow(0).getCell(1).getStringCellValue();
			System.out.println(row_01);
			
			String row_02 = sheet.getRow(0).getCell(2).getStringCellValue();
			System.out.println(row_02);
			
			String row_10 = sheet.getRow(1).getCell(0).getStringCellValue();
			System.out.println(row_10);
			
			String row_11 = sheet.getRow(1).getCell(1).getStringCellValue();
			System.out.println(row_11);
			
			double row_12 = sheet.getRow(1).getCell(2).getNumericCellValue();
			
			System.out.println(row_12);
			
			XSSFRow row = sheet.getRow(2);
			Iterator<Cell> itr = row.iterator();
			
			while(itr.hasNext()) {
				Cell data = itr.next();
				String data1 = data.toString();
				
				System.out.println(data1);
			}
			
			
			int last_row = sheet.getLastRowNum();
			System.out.println("total number of rows are : "+ last_row);
			
			short last_column = sheet.getRow(0).getLastCellNum();
			System.out.println("total number of columnss are: "+ last_column);
			
			
			for(int i =0 ; i<= last_row; i++) {
				for(int j=0; j< last_column; j++) {
					String data = sheet.getRow(i).getCell(j).toString();
					System.out.print(data+"   ");
				}
				System.out.println();
			}
			workbook.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
