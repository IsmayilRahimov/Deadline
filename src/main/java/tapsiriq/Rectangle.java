package tapsiriq;

public class Rectangle extends Shape {

    double width;
    double height;


    @Override
    double calcArea() {

        double area = width * height;

        System.out.println(area);


        return area;



    }

}


