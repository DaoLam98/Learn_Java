package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
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
        List<Person> list = new ArrayList<>();
        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("person.json");
            Type type = new TypeToken<List<Person>>(){}.getType();

             list = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for(Person p : list){
            System.out.println(p.getName());
        }

        try {
            JsonWriter jsonWriter = new JsonWriter(new FileWriter("my_file.json"));
            jsonWriter.beginArray();
            for (Person person : list) {
                jsonWriter.beginObject();
                jsonWriter.name("name").value(person.getName());
                jsonWriter.name("email").value(person.getEmail());
                jsonWriter.name("mobile").value(person.getMobile());
                jsonWriter.endObject();
            }
            jsonWriter.endArray();
            jsonWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
