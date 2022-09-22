package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        List<String[]> list = new ArrayList<String[]>();
        try {
            FileReader fileReader = new FileReader("data.csv");

            CSVReader csvReader = new CSVReader(fileReader);
            list = csvReader.readAll();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvException e) {
            throw new RuntimeException(e);
        }

        for (String[] row : list){
            for(String cell : row){
                System.out.print(cell + "\t");
            }
            System.out.println();
        }

        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter("test.csv"));
            csvWriter.writeAll(list);
            csvWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        CsvHandling csvHandling = new CsvHandling();
//        List<Person> list = csvHandling.readCsv();
//
//        for(Person p : list){
//            System.out.println(p.getName() + " - " + p.getEmail() + " - " +
//                    p.getMobile() + " - " + p.getAddress());
//        }
//
//        csvHandling.writeCsv(list);
    }


}
