package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
		
		try {
			
			FileInputStream fis = new FileInputStream("C:\\Users\\VINOTH\\eclipse-workspace\\BestBuy\\Book2.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(sheetind);
			//XSSFSheet sheet = workbook.getSheetAt(0);

			Row row = sheet.getRow(rowind);
			Cell cell = row.getCell(colind);
			
//		    Row row = sheet.getRow(1);
//		    Cell cell = row.getCell(1);
			
			//System.out.println(cell);
			//System.out.println(sheet.getRow(0).getCell(0));
			//String cellval = cell.getStringCellValue();
			//System.out.println(cellval);
			
			DataFormatter format = new DataFormatter();
			data = format.formatCellValue(cell);
			
			workbook.close();
			//return data;
			//return cell;
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		  return data;
	}
	
	
	
	public String excel() throws Throwable {
		//Get the address in a variable
		String address = null;
		try {
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
			
			address = cell.getStringCellValue();
			
			//Printing the address
			//System.out.println("Address is :"+ address);
			System.out.println(address);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return address;
        
	}
	
//public String[][] readExcel() {
//
//	//String[][] data = null;
//	
//	
//		
//	  //XSSFWorkbook book=new XSSFWorkbook("./data/"+excelfile+".xlsx");  // open work book
//		XSSFWorkbook book=new XSSFWorkbook("C:\\Users\\VINOTH\\eclipse-workspace\\BestBuy\\Book2.xlsx");  // open work book
//		XSSFSheet sheet = book.getSheetAt(1);
//		int rowcount = sheet.getLastRowNum(); //2
//		short columnCount = sheet.getRow(0).getLastCellNum(); //2
//		
//		//String[][]  
//		String[][] data = new String[rowcount][columnCount];
//		for (int i = 0; i <= rowcount; i++) {
//			XSSFRow row = sheet.getRow(i);
//			for (int j = 0; j <= columnCount; j++) {
//				XSSFCell cell = row.getCell(j);
//				//System.out.println(cell.getStringCellValue());
//				//data[i-1][j]=cell.getStringCellValue();   // [0][0] - leema [1][1] abc 
//				data[i][j]=cell.getStringCellValue();   // [0][0] - leema [1][1] abc 
//				
//			}
//		}
//		book.close();
//		return data;
	
	public static String[][] readExcelSheet() throws IOException {
		
		//XSSFWorkbook book=new XSSFWorkbook("./data/"+excelfile+".xlsx");  // open work book
		XSSFWorkbook book=new XSSFWorkbook("C:\\Users\\VINOTH\\eclipse-workspace\\BestBuy\\Book2.xlsx");  // open work book
		XSSFSheet sheet = book.getSheetAt(1);
		int rowcount = sheet.getLastRowNum(); //2
		short columnCount = sheet.getRow(0).getLastCellNum(); //2
		
		String [][] data= new String[rowcount][columnCount]; // data[2][2]
		for (int i = 0; i < rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				//System.out.println(cell.getStringCellValue());
				data[i][j]=cell.getStringCellValue();   // [0][0] - leema [1][1] abc 
				System.out.println(cell.getStringCellValue());
			}
		}
		book.close();
		return data;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
