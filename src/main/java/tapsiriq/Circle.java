package tapsiriq;

public class Circle extends Shape {

    double radius;



    @Override
    double calcArea() {

        double area = Math.PI * radius * radius;

        System.out.println(area);


        return area;



    }

}
