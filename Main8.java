//Практика: написать функцию деления двух чисел с обработкой деления на ноль.


class Calculator {
    static int delenie(int a, int b) {
        try {
            if (b == 0) {
                throw new Exception("exception");
            } else {
                return a / b;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}

public class Main8 {
    public static void main(String[] args) {
        System.out.println(Calculator.delenie(10, 2));
    }
}