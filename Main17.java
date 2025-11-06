//Практика: интерфейс Printer разделить на SimplePrinter и AdvancedPrinter.


interface Printer {
    void print(String document);
}

interface SimplePrinter extends Printer {
    void print(String document);
}

interface AdvancedPrinter extends Printer {
    void scan(String document);
    void fax(String document);
}

class BasicPrinter implements SimplePrinter {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }
}

class MultiFunctionPrinter implements AdvancedPrinter {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning document: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("Faxing document: " + document);
    }
}


public class Main17 {
    public static void main(String[] args) {
        SimplePrinter simplePrinter = new BasicPrinter();
        simplePrinter.print("Simple Document");

        AdvancedPrinter advancedPrinter = new MultiFunctionPrinter();
        advancedPrinter.print("Advanced Document");
        advancedPrinter.scan("Advanced Document");
        advancedPrinter.fax("Advanced Document");
    }
}