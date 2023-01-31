package com.company;

public enum POSITION {

    JUNIOR( 5000) ,
    MIDDLE( 10000 ),
    SENIOR( 20000 ),
    SENIOR_POMIDOR( 30000 );

    public final int minSalary;

    POSITION(int minSalary) { //благодаря этому конструтору можно избавиться от свич-кейса и ифа, объявив зп внутри инамов
        this.minSalary = minSalary;
    }

}
