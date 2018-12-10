package gov.mst.automation.ica.excelutility;

/*
	* Author	 				: Nanthini PushpaRaja
	* Created date			: Nov 26, 2018
	* Last Edited by		: Nanthini PushpaRaja
	* Last Edited date		: Dec 08, 2018
	* Description			: Class is used to define the methods to get the data from excel
*/ 

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	 Workbook workbook;
	 Sheet sheet;
	 String data;
	 String FileName;
	 
	 public ExcelUtility(String FileName)
	 {
		 this.FileName = FileName;
	 }
	 
	 
	 // Method is used to get the sheet from the file using the given file name and sheet name
	 
	public void selectSheet(String SheetName) throws Exception
	{
		String file = FileName;
		File f = new File(file);
		FileInputStream in = new FileInputStream(f);
		String extension = file.substring(file.indexOf('.'), file.length());
		if(extension.equals(".xls"))
		{
			workbook = new HSSFWorkbook(in);
		}
		else if(extension.equals(".xlsx"))
		{
			workbook = new XSSFWorkbook(in);
		}
		else
		{
			throw new Exception("Invlid file Extension");
		}
		sheet = workbook.getSheet(SheetName);
		
	}

	
	
	// Method is used to get the data from any type of cell and returns the data as String
	
	public  String  getStringData(int Row, int Col)
	{
		int celltype = sheet.getRow(Row).getCell(Col).getCellType();
		
		Object data = null;
		
		switch(celltype)
		{
		case Cell.CELL_TYPE_NUMERIC : //0
			data =  new BigDecimal(sheet.getRow(Row).getCell(Col).getNumericCellValue()).toPlainString();
			break;
			
		case Cell.CELL_TYPE_STRING :  //1
			data =  sheet.getRow(Row).getCell(Col).getStringCellValue();
			break;
		
		case Cell.CELL_TYPE_BOOLEAN :  //4
			data = sheet.getRow(Row).getCell(Col).getBooleanCellValue();
			break;
				
		case Cell.CELL_TYPE_BLANK :  //3
			data =  sheet.getRow(Row).getCell(Col).getStringCellValue();
			break;
		
		case Cell.CELL_TYPE_ERROR :  // 5
			data =  sheet.getRow(Row).getCell(Col).getErrorCellValue();
			break;
			
		}
		return data.toString();
		
	}
	
	
	// Method is used to return the data from a column
	
	public String getData(String tcName, String columnName) throws Exception
	{
		
		int rows = sheet.getLastRowNum();
		
		String result= null;
		
		for(int i=1;i<=rows;i++)
		{
			String tcname = sheet.getRow(i).getCell(0).getStringCellValue();
			
			if(tcname.equals(tcName))
			{
				int col = sheet.getRow(i).getLastCellNum();
				
				for(int j=2;j<col;j++)
				{
					String colname = sheet.getRow(0).getCell(j).getStringCellValue();
					
					if(colname.equalsIgnoreCase(columnName))
					{
						result = getStringData(i, j);	
					}
									
				}
						
				}
			}
								
			return result;			
	}
	
	
	// Method is used to count the total number of rows in a sheet
	
	public int getTotalRows()
	{
		int rows = sheet.getLastRowNum();
		return rows;
	}
	
	
	// Method is used to count the total number of columns in a row
	
	public int getTotalColumns(int Row)
	{
		int col = sheet.getRow(Row).getLastCellNum();
		return col;
	}

}
