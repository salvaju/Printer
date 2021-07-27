public class Main {

    public static void main(String[] args) {
        Printer coloredPrinter = new ColorPrinter();
        coloredPrinter.print();
        Printer blackAndWhitePrinter = new BlackAndWhitePrinter();
        blackAndWhitePrinter.print();
    }

}
