package com.company;

public class Employee {

    public String firstName;
    public String lastName;
    public int age;
    public String team;
    public long salary;
    public POSITION position;

    public Employee(String firstName, String lastName, int age, String team, POSITION position) {
        this(firstName, lastName, age, team, 0, position);
    }

    public Employee(String firstName, String lastName, int age, String team, long salary, POSITION position) { // конструктор с аргументами

        if (age < 18) {
            System.out.println("Incorrect age value");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.team = team;

        if (salary == 0) { // если использовать else, то при выполнении условия цикл не продолжиться,
            // а если только if, то программа зайдет в каждое условие и проверит его
            switch (position) {
                case JUNIOR:
                    salary = 5000;
                    break;
                case MIDDLE:
                    salary = 10000;
                    break;
                case SENIOR:
                    salary = 20000;
                    break;
            }

//            if ( position == POSITION.JUNIOR ) { // это всё можно заменить на свич-кейс как выше
//                salary = 5000;
//            } else if ( position == POSITION.MIDDLE ) {
//                salary = 10000;
//            } else if ( position == POSITION.SENIOR ) {
//                salary = 20000;
//            }
        }
        this.salary = salary;
        this.position = position;
    }

}
