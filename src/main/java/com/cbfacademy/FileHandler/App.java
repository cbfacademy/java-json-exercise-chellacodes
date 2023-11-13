package com.cbfacademy.FileHandler;

import java.util.List;

import com.cbfacademy.Employee.Employee;

public class App {

    public static void main (String[] args) {
        

        String filename = "src/main/resources/example.json";

        List<Employee> employees = JSONFileHandler.readFile(filename);

        if (employees != null) {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        } else {
            System.out.println("An error occurred while reading the JSON file.");
        }
    }

        

}

