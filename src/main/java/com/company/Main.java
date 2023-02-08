package com.company;

import java.util.*;

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

        Employee[] employees = new Employee[5];
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
//        for (Employee employee : employees) { // это укороченная запись (int index = 0; index < employees.length; index++)
//            if (employee != null) {// хоть выше и объявлено employee меньше, чем 5, при таком ифе будут выведены все не null
//                namePrinter.print(employee);
//                salaryPrinter.print(employee);
//            }
//        }
        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(new Employee("Sasha", "Borisov", 30, "AQA", POSITION.JUNIOR));
//        employeeList.add(new Employee("Boris", "Petrov", 45, "Developer", POSITION.SENIOR));
//        employeeList.add(new Employee("Gleb", "Popov", 25, "AQA", POSITION.MIDDLE));
//        employeeList.add(new Employee("Ivan", "Ivanov", 26,"QA", 25000, POSITION.JUNIOR));
//        employeeList.add(new Employee("Ivan", "Ivanov", 26,"QA", 25000, POSITION.MIDDLE));

        addToList(new Employee("Sasha", "Borisov", 30, "AQA", POSITION.JUNIOR), employeeList);
        addToList(new Employee("Ivan", "Ivanov", 26, "QA", 25000, POSITION.JUNIOR), employeeList);
        addToList(new Employee("Ivan", "Ivanov", 26, "QA", 25000, POSITION.MIDDLE), employeeList);

        for (Employee employee : employeeList) {
            namePrinter.print(employee);
            salaryPrinter.print(employee);
        }

        List<Employee> employeeLinkedList = new LinkedList<>();
        addToList(new Employee("Sasha", "Borisov", 30, "AQA", POSITION.JUNIOR), employeeLinkedList);
        addToList(new Employee("Ivan", "Ivanov", 26, "QA", 25000, POSITION.JUNIOR), employeeLinkedList);
        addToList(new Employee("Ivan", "Ivanov", 26, "QA", 25000, POSITION.MIDDLE), employeeLinkedList);
        addToList(new Employee("Ivan", "Petrov", 26, "QA", 25000, POSITION.MIDDLE), employeeLinkedList);
        addToList(new Employee("Gleb", "Popov", 25, "AQA", POSITION.SENIOR), employeeLinkedList);
        addToList(new Employee("Boris", "Petrov", 45, "Developer", POSITION.SENIOR), employeeLinkedList);

        for (Employee employee : employeeLinkedList) {
            namePrinter.print(employee);
            salaryPrinter.print(employee);
        }

//        //посчитать людей по позициям по простому можно так через ввод интов и цикла,а можно с помощью коллекции Map<>
//        int juniorCount = 0; // JUNIOR будет ключем к значению juniorCount
//        int middleCount = 0; // MIDDLE будет ключем к значению middleCount
//        int seniorCount = 0; // SENIOR будет ключем к значению seniorCount

        Map<POSITION, Integer> counter = new HashMap<>();

        for (Employee employee : employeeLinkedList) {
            if ( !counter.containsKey(employee.position) ) {
                counter.put(employee.position, 1);
            } else {
                counter.put( employee.position, counter.get(employee.position) +1);
            }
        }

        System.out.println("***************************");
        System.out.println("Position counter" + counter);

        //данный цикл связан с интами выше, от которых мы избавились благодаря Мапе
//        for (Employee employee : employeeLinkedList) {
//           if (employee.position == POSITION.JUNIOR) {
//               juniorCount++;
//           } else if (employee.position == POSITION.MIDDLE) {
//               middleCount++;
//           } else {
//               seniorCount++;
//           }
//        }

//        System.out.println("Junior count " + juniorCount);
//        System.out.println("Middle count " + middleCount);
//        System.out.println("Senior count " + seniorCount);


        //ниже описано удаление объекста из employeeLinkedList
//        for ( Employee employee : employeeLinkedList) {
//            if (employee.firstName.equals("Ivan") && employee.lastName.equals("Ivanov")) {
//                employeeLinkedList.remove(employee);//или в скобках указать индекс удаляемого объекта
//            }
//        }
//        System.out.println("******************** employeeLinkedList is below **********************");
//        System.out.println(employeeLinkedList);

        // отсортировать по позиции: JUNIOR,SENIOR,MIDDLE,JUNIOR -> JUNIOR,JUNIOR,MIDDLE,SENIOR
        // сравниваем пары инамов по ординалам [JUNIOR,SENIOR] -> [JUNIOR,SENIOR], затем [SENIOR,MIDDLE] -> [MIDDLE,SENIOR]

//        for (int index = 0; index < employeeList.size() - 1; index++) {
//            if (employeeList.get(index).position.ordinal() > employeeList.get(index + 1).position.ordinal()) {
//                Collections.swap(employeeList, index + 1, index);
//            }
//        }
//        System.out.println(employeeList); // выводит инфо в нечитабельном виде -> [com.company.Employee@490d6c15, com.company.Employee@7d4793a8, com.company.Employee@449b2d27, com.company.Employee@5479e3f]

    }

    //после написания метода addToList можно добавлять объекты в список используя этот метод, в котороместь проверка на почторения вносимых employee
    public static void addToList(Employee employee, List<Employee> employeeList) {
        if (!employeeList.contains(employee))//тут мы првоеряем дубликаты, сам метод иквэлс встроен, мы его перегрузили в Employee
            employeeList.add(employee);
        else {
            System.out.println("Dublicate employee " + employee.firstName + " " + employee.lastName);
        }
    }

}