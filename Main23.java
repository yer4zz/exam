//Практика: создать класс Student с приватным полем grade и сеттером с валидацией (от 1 до 5).


public class Main23 {
    private int grade;

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 5) {
            this.grade = grade;
        } else {
            System.out.println("Ошибка: оценка должна быть в диапазоне от 1 до 5.");
        }
    }

    public int getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Student student = new Student();

        student.setGrade(4);
        System.out.println("Оценка студента: " + student.getGrade());

        student.setGrade(6);
        System.out.println("Оценка студента: " + student.getGrade());
    }
}
