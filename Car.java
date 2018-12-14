package Interfaces;

public class Car implements Vehicle {
    int speed;
    String kind;

    public void color(){
        System.out.println("red color Car");


    }

    public void kind(String a){
        kind = a;
    }

    @Override
    public int topSpeed(int a ){
        speed = a;
        speed+=15;
        return speed;
    }
}
