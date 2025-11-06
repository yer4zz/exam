//Практика: написать универсальный класс Box<T>, который хранит значение любого типа.


public class Main30 {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" + "value=" + value + '}';
    }

    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>(123);
        System.out.println(intBox);

        Box<String> strBox = new Box<>("Hello World");
        System.out.println(strBox);

        Box<Double> doubleBox = new Box<>(3.14);
        System.out.println(doubleBox);

        strBox.setValue("New Value");
        System.out.println(strBox);
    }
}
