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

        if (salary == 0) {
            salary = position.minSalary;

//            switch (position) { // свич-кейсом можно заменить иф-элс
//                case JUNIOR:
//                    salary = 5000;
//                    break;
//                case MIDDLE:
//                    salary = 10000;
//                    break;
//                case SENIOR:
//                    salary = 20000;
//                    break;
//                default: salary = -10000;
//            }

// если использовать else, то при выполнении условия цикл не продолжиться,
            // а если только if, то программа зайдет в каждое условие и проверит его
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

    public String toString() {
        return "Employee info: " + this.firstName + " " + this.lastName + " " + this.position.toString();
    }

    public boolean equals(Object obj) {
//        if (obj instanceof Employee) { //instanceof - это проверка принадлежности объекта классу
//            if (((Employee) obj).firstName.equals(this.firstName) &&
//                    ((Employee) obj).lastName.equals(this.lastName)) {
//                return true;
//            }
//        }
//        return false;//вот эти каскады ифов и ретернов можно записать как ниже через 1 ретерн

        return obj instanceof Employee //если на этой строке не будет тру, то просто придет фолс и всё
                && ((Employee) obj).firstName.equals(this.firstName)
                && ((Employee) obj).lastName.equals(this.lastName);

    }

}
