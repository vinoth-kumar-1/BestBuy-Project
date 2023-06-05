package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileUtil {

	public String readProperty(String key) {

		String value = null;

		try {

			FileInputStream fileinput = new FileInputStream(
					"C:\\Users\\VINOTH\\eclipse-workspace\\BestBuy\\src\\test\\resources\\config.properties");
			Properties prop = new Properties();

			prop.load(fileinput);

			value = prop.getProperty(key);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;

	}
	
	
	public String excelMethod(int sheetind, int rowind, int colind) {
		String inputpath = System.getProperty("user.dir") + "/Book1.xlsx";
		String data = null;
		
		try {
			
			FileInputStream instream = new FileInputStream(inputpath);
			
			XSSFWorkbook book = new XSSFWorkbook(instream);
			
			XSSFSheet sheet = book.getSheetAt(sheetind);
			
			
			//Cell cell = sheet.getRow(2).getCell(3);
			
			Row row = sheet.getRow(rowind);
			Cell cell = row.getCell(colind);		
			
			
			
			DataFormatter format = new DataFormatter();
			data = format.formatCellValue(cell);
			
			
			
			//System.out.println(cell);
			//System.out.println(data);
			
			
			//System.out.println(sheet.getLastRowNum());
			
			
			book.close();
			instream.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	public String excelMethodWithSheetNo(int sheetind, int rowind, int colind) throws Throwable {
		String data = null;
		
		FileInputStream fis = new FileInputStream("C:\\Users\\VINOTH\\eclipse-workspace\\BestBuy\\Book2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(sheetind);
		//XSSFSheet sheet = workbook.getSheetAt(0);
		
                    
		
		Row row = sheet.getRow(rowind);
		Cell cell = row.getCell(colind);
		
//		Row row = sheet.getRow(1);
//		Cell cell = row.getCell(1);
		
        //System.out.println(cell);
		//System.out.println(sheet.getRow(0).getCell(0));
		//String cellval = cell.getStringCellValue();
		//System.out.println(cellval);
		
	    DataFormatter format = new DataFormatter();
		data = format.formatCellValue(cell);
		
		//workbook.close();
		return data;
		//return cell;
		
	}
	
	public String excel() throws Throwable {
		//Create an object of File class to open xlsx file
        File file = new File("C:\\Users\\VINOTH\\eclipse-workspace\\BestBuy\\Book2.xlsx");
        
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        
        //Creating workbook instance that refers to .xls file
        XSSFWorkbook wb = new XSSFWorkbook(inputStream);
        
        //Creating a Sheet object using the sheet Name
        XSSFSheet sheet = wb.getSheet("Sheet1");
        
        //Create a row object to retrieve row at index 1
        XSSFRow row2=sheet.getRow(11);
        
        //Create a cell object to retreive cell at index 5
        XSSFCell cell=row2.getCell(0);
        
        //Get the address in a variable
        String address= cell.getStringCellValue();
        
        //Printing the address
        //System.out.println("Address is :"+ address);
        System.out.println(address);
		return address;
        
	}
	

}
