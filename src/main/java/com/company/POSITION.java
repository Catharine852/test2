package com.company;

public enum POSITION {

    JUNIOR( 5000) , //ординал=0
    MIDDLE( 10000 ), //ординал=1
    SENIOR( 20000 ), //ординал=2
    SENIOR_POMIDOR( 30000 ); //ординал=3

    public final int minSalary;

    POSITION(int minSalary) { //благодаря этому конструтору можно избавиться от свич-кейса и ифа, объявив зп внутри инамов
        this.minSalary = minSalary;
    }

}
