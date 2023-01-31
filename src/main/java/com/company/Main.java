package com.company;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", "Ivanov", 26,
                "QA", 25000, POSITION.JUNIOR); // создали объект с данными
        EmployeeNamePrinter namePrinter = new EmployeeNamePrinter();
        namePrinter.print( employee1 );

        EmployeeSalaryPrinter salaryPrinter = new EmployeeSalaryPrinter();
        salaryPrinter.print( employee1 );

        Employee employee2 = new Employee("", "",
                16, "QA", -25000, POSITION.MIDDLE);
        namePrinter.print( employee2 );
        salaryPrinter.print( employee2 );
    }
}