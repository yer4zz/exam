//Создать класс Car с полями brand, year, методом displayInfo() для вывода данных. Использовать один статический метод как минимум.


public class Main1 {
    public static void main(String[] args) {
        Car lexus = new Car("lexus", 2024);
        Car.displayInfo(lexus);
    }
}

class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public static void displayInfo(Car car) {
        System.out.println(car.brand + car.year);
    }
}