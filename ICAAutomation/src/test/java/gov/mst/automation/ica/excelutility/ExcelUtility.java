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
	
	static Workbook wb;
	static Sheet sheetname1;
	static String data;
		
	public static Sheet selectSheet(String sheetname) throws Exception
	{
		String file = "D:\\data.xlsx";
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
		return wb.getSheet(sheetname);
			
	}
			
	public static String excelData(String sheetname,String TcName,String filedname) throws Exception
	{
		sheetname1 = selectSheet(sheetname);
		int rows = sheetname1.getLastRowNum();
		Object result = null;
		
		for(int i=1;i<=rows;i++)
		{
			String tcname = sheetname1.getRow(i).getCell(0).getStringCellValue();
			
			if(tcname.equals(TcName))
			{
				int col = sheetname1.getRow(i).getLastCellNum();
				for(int j=0;j<col;j++)
				{
					String colname = sheetname1.getRow(0).getCell(j).getStringCellValue();
					
					if(colname.equalsIgnoreCase(filedname))
					{
						int celltype = sheetname1.getRow(i).getCell(j).getCellType();
						
						switch(celltype)
						{
						case Cell.CELL_TYPE_NUMERIC : //0
							result = new BigDecimal(sheetname1.getRow(i).getCell(j).getNumericCellValue()).toPlainString();
							break;
							
						case Cell.CELL_TYPE_STRING :  //1
							result = sheetname1.getRow(i).getCell(j).getStringCellValue();
							break;
						
						case Cell.CELL_TYPE_BOOLEAN :  //4
							result = sheetname1.getRow(i).getCell(j).getBooleanCellValue();
							break;
								
						case Cell.CELL_TYPE_BLANK :  //3
							result = sheetname1.getRow(i).getCell(j).getStringCellValue();
							break;
						
						case Cell.CELL_TYPE_ERROR :  // 5
							result = sheetname1.getRow(i).getCell(j).getErrorCellValue();
							break;
							
						}
					}
						
					
				}
			}
			
		}
			return result.toString();			
	}

}
