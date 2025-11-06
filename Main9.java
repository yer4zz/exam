//Практика: создать класс Vector с перегрузкой оператора сложения


class Vector {
    int a, b;

    Vector(int a, int b){
        this.a = a;
        this.b = b;
    }

    Vector add(Vector other){
        return new Vector(this.a + other.a, this.b + other.b);
    }

    // @Override
    // public String toString() {
    //     return "Vector(" + a + ", " + b + ")";
    // }
}

public class Main9 {
    public static void main(String[] args) {
        Vector v1 = new Vector(2, 5);
        Vector v2 = new Vector(4, 4);
        Vector v3 = v1.add(v2);
        System.out.println(v3);
    }
}