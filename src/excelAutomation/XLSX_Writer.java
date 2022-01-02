package excelAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSX_Writer {

	public static void main(String[] args) {

		try {
			File fs = new File("./TestData/DataSheet.xlsx");
			FileInputStream fins = new FileInputStream(fs);
			XSSFWorkbook xssf_wb = new XSSFWorkbook(fins);
			XSSFSheet xssf_sheet = xssf_wb.getSheetAt(0);
			
			System.out.println(xssf_sheet.getRow(0).getCell(0).getStringCellValue());
			xssf_sheet.getRow(0).createCell(3).setCellValue("Mobile");
			xssf_sheet.getRow(1).createCell(3).setCellValue("9876543210");
			
			
			FileOutputStream fout = new FileOutputStream(fs);
			
			xssf_wb.write(fout);
			xssf_wb.close();
			
		} catch (Exception e) {
			System.out.println("Exception raised"+ e);
		}
	}

}
