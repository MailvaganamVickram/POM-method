package utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelData {
    public static void main(String [] args) throws IOException {
        // to print user id and password of vickram

        //1.create object of workbook
        String excelfilepath = "C:\\Users\\Vickram.M\\OneDrive\\Desktop\\Excel\\workdata.xlsx";
        FileInputStream fis = new FileInputStream(excelfilepath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        //2.create object of sheet and allocate the respective sheet
        XSSFSheet sheet = null;
        int numsheet = workbook.getNumberOfSheets();

        for (int i=0 ; i<numsheet;i++) {

            if(workbook.getSheetName(i).equalsIgnoreCase("LoginUser")) {
                sheet = workbook.getSheetAt(i);
            }
        }

        //3. Fetch data from our excel file using two iterations

        assert sheet != null;
        Iterator<Row> itrow = sheet.iterator();
        while (itrow.hasNext()) {
            Row row = itrow.next();

            Iterator itcell = row.cellIterator();

            Cell c = (Cell) itcell.next();

            if(c.getStringCellValue().equalsIgnoreCase("Vickram")) {

                while (itcell.hasNext()) {
                    c =(Cell) itcell.next();
                    if(c.getCellType() == CellType.STRING){
                        System.out.println(c.getStringCellValue());
                    }
                    else if(c.getCellType() == CellType.NUMERIC) {
                        System.out.println(c.getNumericCellValue());
                    }

                }

            }
        }

    }
}
