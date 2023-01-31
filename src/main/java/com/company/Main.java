package com.company;

public class Main {
    public static void main(String[] args) {
//        Employee employee1 = new Employee("Ivan", "Ivanov", 26,
//                "QA", 25000, POSITION.JUNIOR); // создали объект с данными
        EmployeeNamePrinter namePrinter = new EmployeeNamePrinter();
//        namePrinter.print( employee1 );
//
        EmployeeSalaryPrinter salaryPrinter = new EmployeeSalaryPrinter();
//        salaryPrinter.print( employee1 );
//
//        Employee employee2 = new Employee("", "",
//                16, "QA", -25000, POSITION.MIDDLE);
//        namePrinter.print( employee2 );
//        salaryPrinter.print( employee2 );
//
//        Employee employee3 = new Employee("Gleb","Popov", 25, "AQA", POSITION.SENIOR);
//        namePrinter.print( employee3 );
//        salaryPrinter.print( employee3 );

        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Sasha", "Borisov", 30, "AQA", POSITION.JUNIOR);
        employees[1] = new Employee("Boris", "Petrov", 45, "Developer", POSITION.SENIOR);

//        namePrinter.print( employees[0] );
//        salaryPrinter.print( employees[0] );
//
//        namePrinter.print( employees[1] );
//        salaryPrinter.print( employees[1] ); // чтоб не писать для каждого employee принты, загоняем в цикл

//        i = 0;
//        i++; - отдай значение в i, а потом добавь 1 -> 0
//        ++i; - добавь 1, а потом отдай значение -> 1

////        for (int index = 0; index < employees.length; index++) { // такой цикл можно сделать иначе, сама идея подсказывает
//        namePrinter.print(employees[index]);
//        salaryPrinter.print(employees[index]);
//    }
        for (Employee employee : employees) {
            namePrinter.print(employee);
            salaryPrinter.print(employee);
        }

    }
}