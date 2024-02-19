package utils;


import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelData2 {

    public void loginTest(String name, String password){
        System.out.println(name + "===="+ password);
    }

    public Object [][] dataProvider() throws IOException {
        File excelfile = new File(System.getProperty("C:\\Users\\Vickram.M\\OneDrive\\Desktop\\Excel\\workdata.xlsx"));
        FileInputStream fis2 = new FileInputStream(excelfile);
        XSSFWorkbook workbook = new XSSFWorkbook(fis2);

        XSSFSheet sheet = workbook.getSheet("LoginUser");
        int rowcount = sheet.getLastRowNum();
        int columncount = sheet.getRow(0).getLastCellNum();

        Object [][] data = new Object[rowcount][columncount];

        for(int r=0; r<rowcount;r ++){
            XSSFRow row = sheet.getRow(r+1);

            for(int c=0; c<columncount; c++){
                XSSFCell cell = row.getCell(c);
                CellType cellType = cell.getCellType();

                switch (cellType){
                    case STRING :
                        data[r][c] =  cell.getStringCellValue();
                        break;
                    case NUMERIC:
                        data[r][c] = cell.getNumericCellValue();
                        break;
                    case BOOLEAN:
                        data[r][c] = cell.getBooleanCellValue();
                        break;
                }
            }
        }
        return data;
    }


}
