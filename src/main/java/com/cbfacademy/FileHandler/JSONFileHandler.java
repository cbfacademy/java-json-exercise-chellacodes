package com.cbfacademy.FileHandler;


import java.io.BufferedReader;
import java.io.File;
import java.util.List;

import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;

import com.cbfacademy.Employee.Employee;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;


public class JSONFileHandler {


    // return a List<Employee> object, where each list item is an Employee object the Employee.java class has been provided for you


    public static List<Employee> readFile(String filename) throws FilenameException {

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            // creates an instance of gson 

            Gson gson = new Gson(); 

            // Defines the type , for gson to parse the list of employees

            Type employeesListType = new TypeToken<List<Employee>>() {}.getType(); 

            // Parse the JSON data from the file into a list of Employee objects 
            
            List<Employee> employees = gson.fromJson(reader, employeesListType);

            // Returns list of employees as an object 

            return employees; 

        } catch (IOException e) {
            e.printStackTrace();
            return null; }

    }
    

    // we are creating a method to save given employer to path defined by outputFile
    // create output file if doesnt exist and update the file to include the new object 


    public static void save(Employee employee, String outputFile) {

        

        







    }
}
    

