package com.seleniummaster.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcellReadDemo2 {
    public List<String> getData(String sheetName,String productName) {
        String filePath="test-data/testdata.xlsx";
        FileInputStream inputStream=null;
        try {
          inputStream=new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int sheets=workbook.getNumberOfSheets();//3
        List<String> products=new ArrayList<>();
        for(int s=0;s<sheets;s++){
            if(workbook.getSheetName(s).equalsIgnoreCase(sheetName)){
                XSSFSheet sheet=workbook.getSheetAt(s);
                Iterator<Row> rows=sheet.iterator();
                while (rows.hasNext()){
                    Row r=rows.next();
                    if(r.getCell(0).getStringCellValue().equalsIgnoreCase(productName)){
                        Iterator<Cell> c=r.cellIterator();
                        while (c.hasNext()){
                            Cell c1=c.next();
                            if(c1.getCellTypeEnum()== CellType.STRING){
                                products.add(c1.getStringCellValue());
                            }else {
                                products.add(NumberToTextConverter.toText(c1.getNumericCellValue()));
                            }
                        }
                    }
                }

            }
        }
        return products;
    }

    public static void main(String[] args) {
        ExcellReadDemo2 excellReadDemo2=new ExcellReadDemo2();
        List<String> products=excellReadDemo2.getData("Product-Info","Java Book");
        List<String> products1=excellReadDemo2.getData("Product-Info","Test Book");
        System.out.println(products.toString());
        System.out.println(products1);
    }
}
