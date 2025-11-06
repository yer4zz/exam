//Практика: создать абстрактный класс Animal с методом makeSound(), реализовать в Dog и Cat.


abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Gaff");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Myau");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
