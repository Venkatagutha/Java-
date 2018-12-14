package EnumT;

public class Ytest {
    Year year;

    public Ytest(Year year) {
        this.year = year;
    }

    public void WhatisIT(){
        switch( year ){
            case JAN:
                System.out.println("Year beginning");
                break;
            case JUN:
                System.out.println("Summer break");
                break;
            case JUL:
                System.out.println("Summer Break");
            case NOV:
                System.out.println("Thanksgiving break");
            case DEC:
                System.out.println("Winter Holidays");
             default:
                 System.out.println("School Year -> No break ");
        }




    }
}
