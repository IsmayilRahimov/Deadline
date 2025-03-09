package tapsiriq;


import Task3.Main;

public class Shape {
    String color;
    double area;

    double calcArea() {
        return 0.0;


    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.radius = 5.5;
        rectangle.width = 3.1;
        rectangle.height = 6.2;


        circle.calcArea();
        rectangle.calcArea();
    }
}
