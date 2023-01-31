package com.company;

public class EmployeeNamePrinter implements Printer{
    @Override
    public void print(Employee employee) {

        if (employee.firstName.isEmpty() || employee.lastName.isEmpty()) { //вместо 2х ифов 1 с бинарным выражением
            System.out.println("Name cannot be empty");

            //if (employee.lastName.isEmpty()) {
//            System.out.println("Last name cannot be empty");
//        }

        } else {
            System.out.println("First name: " + employee.firstName);
            System.out.println("Last name: " + employee.lastName);
            System.out.println("Position: " + employee.position);
        }
    }
}
