import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;

import java.io.IOException;


public class Excel
{
    public static void main(String[] args) throws IOException  {
        String path ="C:\\Users\\user\\Documents\\sample demo.xls";
        FileInputStream   workbook = new FileInputStream(path);
          HSSFWorkbook book = new HSSFWorkbook(workbook);
          Sheet sheet= book.getSheet("Sheet1");
         Row row = sheet.getRow(2);
         System.out.println( row.getCell(3));

 

    }

        }

