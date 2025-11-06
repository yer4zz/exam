//Практика: реализовать фабрику для создания разных видов документов (Word, PDF).


interface Document {
    void open();
}

class WordDoc implements Document {
    @Override
    public void open() {
        System.out.println("WordDoc");
    }
}
class PDFDoc implements Document {
    @Override
    public void open() {
        System.out.println("PDFDoc");
    }
}

abstract class DocFactory {
    abstract Document createDoc();
}
class WordDocFac extends DocFactory {
    Document createDoc() {
        return new WordDoc();
    }
}
class PDFDocFac extends DocFactory {
    Document createDoc() {
        return new PDFDoc();
    }
}

public class Main12 {
    public static void main(String[] args) {
        DocFactory wordFac = new WordDocFac();
        Document worDoc = wordFac.createDoc();
        worDoc.open();
    }
}