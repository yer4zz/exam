//Практика: создать интерфейс Shape и реализовать классы Triangle, Circle


public class Main25 {

    public interface Shape {
        double perimeter();
    }

    static class Triangle implements Shape {
        private double a, b, c;

        public Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public double perimeter() {
            return a + b + c;
        }
    }

    static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }

    public static void main(String[] args) {
        Shape triangle = new Triangle(3, 4, 5);
        Shape circle = new Circle(7);

        System.out.println("Периметр треугольника: " + triangle.perimeter());
        System.out.println("Периметр круга: " + circle.perimeter());
    }
}
