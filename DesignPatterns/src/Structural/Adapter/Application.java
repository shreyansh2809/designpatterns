package Structural.Adapter;

public class Application {
    public static void main(String[] args) {
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Printer printer = new PrinterAdapter(legacyPrinter);
        printer.print();
    }
}
