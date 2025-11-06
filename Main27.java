//Практика: реализовать класс Document, клонирующий свои экземпляры



public class Main27 implements Cloneable {
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Document{title='" + title + "', content='" + content + "'}";
    }

    public static void main(String[] args) {
        Document doc1 = new Document("Title 1", "Content 1");
        Document doc2 = doc1.clone();

        System.out.println(doc1);
        System.out.println(doc2);
    }
}
