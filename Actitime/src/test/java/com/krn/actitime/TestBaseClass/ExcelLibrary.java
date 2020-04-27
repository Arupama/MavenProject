package com.krn.actitime.TestBaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary extends BaseClass {

	public String getExcelData(String Sheetname,int rowNum,int cellnum)
	{
		String retval =null;
		
			try {
				FileInputStream fis = new FileInputStream("../Data/Data.xlsx");
			    Workbook wb=WorkbookFactory.create(fis);
			    Sheet s=wb.getSheet(Sheetname);
			    Row r=s.getRow(rowNum);
			    Cell c=r.getCell(cellnum);
			    retval=c.getStringCellValue();
			   }catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
				}catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
						e.printStackTrace();
				} catch (IOException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return retval;
	}
public int getLastRowNumber(String Sheetname) throws FileNotFoundException
{
	int retval=0;
	try {
		FileInputStream fis=new FileInputStream("D:\\my selenium best\\Project\\Data\\Data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet(Sheetname);
		retval=s.getLastRowNum();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return retval;
	
}
}