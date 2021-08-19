package com.seleniummaster.csvfile;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader {

    public List<String> readFromCsvFile(String folder,String fileName,String headerName){
        List<String> values=new ArrayList<>();
        Reader reader= null;
        try {
            reader = new FileReader(folder+ File.separator+fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Iterable<CSVRecord> records= null;
        try {
            records = CSVFormat.RFC4180.withHeader(headerName)
                    .parse(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(CSVRecord record:records){
            String contents=record.get(headerName);
            values.add(contents);
        }
        return values;
    }

    public static void main(String[] args) {

    }
}
