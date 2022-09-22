package org.example;

import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvHandling {

    public List<Person> readCsv(){
        List<Person> list = new ArrayList<>();

        try {
            FileReader reader = new FileReader("data.csv");
            CsvToBeanBuilder<Person> csvToBeanBuilder =
                    new CsvToBeanBuilder<>(reader);
            list = csvToBeanBuilder.withType(Person.class).build().parse();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

    public void writeCsv(List<Person> list){


        try {
            FileWriter writer = new FileWriter("my_file.csv");
            StatefulBeanToCsvBuilder<Person> beanToCsv =
                    new StatefulBeanToCsvBuilder<Person>(writer);


            beanToCsv.withApplyQuotesToAll(false)
                    .build().write(list);
            writer.close();

        } catch (IOException | CsvRequiredFieldEmptyException | CsvDataTypeMismatchException e) {
            throw new RuntimeException(e);

        }
    }
}
