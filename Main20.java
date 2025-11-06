//Практика: создать класс Book с полями, переопределить __str__/toString


public class Main20 {
    private String title;
    private String author;
    private int year;

    public Main20(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', year=" + year + "}";
    }

    public static void main(String[] args) {
        Main20 book = new Main20("1984", "George Orwell", 1949);
        System.out.println(book); 
    }
}
