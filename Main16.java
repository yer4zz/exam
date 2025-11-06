//Практика: создать класс Report с методом export(), вынести разные форматы экспорта в отдельные классы



interface Exportable {
    void export();
}

class Report {
    Exportable exportStrategy;

    Report(Exportable exportStrategy) {
        this.exportStrategy = exportStrategy;
    }

    void export() {
        exportStrategy.export();
    }
}

class ExportToPDF implements Exportable {
    public void export() {
        System.out.println("Экспорт в PDF");
    }
}

class ExportToCSV implements Exportable {
    public void export() {
        System.out.println("Экспорт в CSV");
    }
}

public class Main16 {
    public static void main(String[] args) {
        new Report(new ExportToPDF()).export();

        new Report(new ExportToCSV()).export();
    }
}