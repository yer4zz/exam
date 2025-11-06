//Практика: реализовать класс Point с методами вычисления расстояния между точками.


public class Main19 {
    private double x, y;

    public Main19(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Main19 other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    public static void main(String[] args) {
        Main19 p1 = new Main19(1, 2);
        Main19 p2 = new Main19(4, 6);
        
        System.out.println("Расстояние между точками: " + p1.distance(p2));
    }
}
