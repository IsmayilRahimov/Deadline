package Deadline;

public class Car extends Vehicle {


    @Override
    void move() {

        super.move();
        System.out.println(" Masin hereket edir ");
    }

    void horn() {
        System.out.println(" Siqnal verilir ");
    }


}







