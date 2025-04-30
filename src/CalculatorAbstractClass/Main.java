package CalculatorAbstractClass;

public class Main {
    public static void main(String[] args) {

        Rectangle area = new Rectangle(3, 5);
        System.out.println(area.calculateArea());

        Circle area1 = new Circle(8);
        System.out.println(area1.calculateArea());

        Triangle area2 = new Triangle(3, 5);
        System.out.println(area2.calculateArea());

        Square area3 = new Square(4, 9);
        System.out.println(area3.calculateArea());

        Polygon area4 = new Polygon(9);
        System.out.println(area4.calculateArea());
    }
}

abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {

    public double length;
    public double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {

    public double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 0.5 * radius * radius;
    }
}

class Triangle extends Shape {

    public double base;
    public double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }
}

class Square extends Rectangle{

    public double length;
    public double width;

    public Square(double length, double width) {
        super(length, width);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width * length;
    }
}

class Polygon extends Shape{

 public double side;

    public Polygon(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

class Pentagon extends Shape{

    public double hypotenus;

    public Pentagon(double hypotenus){
        this.hypotenus = hypotenus;
    }

    @Override
    public double calculateArea() {
        return Math.PI * hypotenus * hypotenus ;
    }
}
