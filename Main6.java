//Практика: создать класс MathUtils с перегруженными методами add() для int и double.


class MathUtils {
    int add(int a, int b){
        return a + b;
    }

    double add (double a, double b){
        return a + b;
    }
}

public class Main6 {
    public static void main(String[] args) {
        MathUtils mt = new MathUtils();
        System.out.println(mt.add(3,6));
        System.out.println(mt.add(3.2,6.2));
    }
}
