package gov.mst.automation.ica.excelutility;

/**
 * 
 * @author Nanthini PushpaRaja
 * Created date: Nov 26, 2018
 * Last Edited by: Nanthini PushpaRaja
 * Last Edited date: Nov 26, 2018
 * Description: This ExcelUtility is used to perform the read and write operations on excel sheet
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
	
	 Workbook wb;
	 Sheet sheetname;
	 String data;
		
	public void selectSheet(String FileName, String SheetName) throws Exception
	{
		String file = FileName;
		File f = new File(file);
		FileInputStream in = new FileInputStream(f);
		String extension = file.substring(file.indexOf('.'), file.length());
		if(extension.equals(".xls"))
		{
	       wb = new HSSFWorkbook(in);
		}
		else if(extension.equals(".xlsx"))
		{
			wb = new XSSFWorkbook(in);
		}
		else
		{
			throw new Exception("Invlid file Extension");
		}
		sheetname = wb.getSheet(SheetName);
			
	}

	
	String convertString(int Row, int Col)
	{
		int celltype = sheetname.getRow(Row).getCell(Col).getCellType();
		
		Object data = null;
		
		switch(celltype)
		{
		case Cell.CELL_TYPE_NUMERIC : //0
			data =  new BigDecimal(sheetname.getRow(Row).getCell(Col).getNumericCellValue()).toPlainString();
			break;
			
		case Cell.CELL_TYPE_STRING :  //1
			data =  sheetname.getRow(Row).getCell(Col).getStringCellValue();
			break;
		
		case Cell.CELL_TYPE_BOOLEAN :  //4
			data = sheetname.getRow(Row).getCell(Col).getBooleanCellValue();
			break;
				
		case Cell.CELL_TYPE_BLANK :  //3
			data =  sheetname.getRow(Row).getCell(Col).getStringCellValue();
			break;
		
		case Cell.CELL_TYPE_ERROR :  // 5
			data =  sheetname.getRow(Row).getCell(Col).getErrorCellValue();
			break;
			
		}
		return data.toString();
		
	}
	
	
	
	public String[][] getData(String TcName) throws Exception
	{
		
		int rows = sheetname.getLastRowNum();
		
		String[][] result= null;
		
		for(int i=1;i<=rows;i++)
		{
			String tcname = sheetname.getRow(i).getCell(0).getStringCellValue();
			
			if(tcname.equals(TcName))
			{
				int col = sheetname.getRow(i).getLastCellNum();
				result = new String[1][col-2];
				for(int j=2;j<col;j++)
				{
					result[0][j-2] = convertString(i, j);					
				}
						
				}
			}
								
			return result;			
	}

}
