package com.company;

public class EmployeeSalaryPrinter implements Printer {

    @Override /* можно не писать */
    public void print(Employee employee) {

        if (employee.salary < 0) {
            System.out.println("Incorrect salary value");
        } else if ( employee.salary >= 5000) {

            System.out.println("Salary: " + employee.salary);
        }
    }
}

