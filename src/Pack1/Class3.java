package Pack1;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Class3 
{
	XSSFWorkbook wb;
	XSSFSheet sh;
	public Class3(String excelpath) throws Exception
	{
		File src=new File(excelpath);
		FileInputStream fis=new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
	}
	public String getData(int SheetNumber,int row,int col)
	{
		sh=wb.getSheetAt(SheetNumber);
		String str=sh.getRow(row).getCell(col).getStringCellValue();
		return str;
	}

}
