package com.cbfacademy.FileHandler;

import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.cbfacademy.Employee.Employee;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class JSONFileHandler {

    String filename = "src/main/resources/example.json";

    // Read and Write with Json from a file. (Parse) 
    //decilratising converting an object into string representation
    // json = plains text 
    // read content from json file and convert it to objects that our code recognises

    public static List<String> readFile(String filename) {

        // creates Gson instrance 

        Gson gson = new Gson(); 

        // create a reader 

        Reader reader = Files.newBufferedReader(Paths.get("example.json"));

        // convert JSON file to list of users 
        
        List<Employee> employee = new Gson()son.fromJson(reader, Employee.class);
        //  data = gson.toJson(reader, example.json);


        // type token (collection type)

        TypeToken<List<Employee>> collectionType = new TypeToken<List<Employee>>(){};


        // call from json method and provide it with json string and the type we want it to convert to.

        // capture a read in our variable.


    }

    // we are creating a method to 


    public static void save(Employee employee, String outputFile) {

        


    }
    
}
