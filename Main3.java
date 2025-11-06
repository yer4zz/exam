//Создать класс Counter со статическим полем-счётчиком количества созданных объектов


class Counter {
    static int count = 0;

    public Counter() {
        count++;
    }

    public static void displayCount() {
        System.out.println(count);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Counter c = new Counter();
        Counter.displayCount();
        
        System.out.println(c);
    }
}