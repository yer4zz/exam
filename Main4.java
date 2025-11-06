//Практика: создать базовый класс Shape и классы Circle, Square, переопределяющие метод area()


abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}

class Square extends Shape {
    double a;
    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape square = new Square(3);

        System.out.println(circle.area());
        System.out.println(square.area());
    }
}
