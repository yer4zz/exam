//Реализовать класс Rectangle с полями width, height, методом area() для вычисления площади.


class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(2, 8);
        System.out.println(rec.area());
    }
}