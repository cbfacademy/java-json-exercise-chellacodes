package com.cbfacademy.FileHandler;


import java.io.BufferedReader;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;

import com.cbfacademy.Employee.Employee;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class JSONFileHandler {

    public static List<Employee> readFile(String filename) {

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            Gson gson = new Gson(); 

            Type employeesLisType = new TypeToken<List<Employee>>() {}.getType(); 
            
            List<Employee> employees = gson.fromJson(reader, employeesLisType);

            employees.forEach(System.out::println);

            return employees; 

        } catch (IOException e) {
            e.printStackTrace();
            return null; }

    }








    

    // we are creating a method to 


    public static void save(Employee employee, String outputFile) {

        


    }
}
    

