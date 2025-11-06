// Практика: реализовать метод clone() для класса Employee.


public class Main22 implements Cloneable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "'}";
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John");

        Employee emp2 = emp1.clone();

        System.out.println("Оригинальный сотрудник: " + emp1);
        System.out.println("Клонированный сотрудник: " + emp2);
    }
}
