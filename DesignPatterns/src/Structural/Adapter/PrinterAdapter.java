package Structural.Adapter;


//this is our adapter
public class PrinterAdapter implements Printer {

    LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print() {
        legacyPrinter.printingInLegacyWay();
    }
}
