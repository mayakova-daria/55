package app;

public class Main {
    public static void main(String[] args) {
        Printer printer = new PrinterImpl();


        Printer.Message msg1 = new Printer.Message("Погода сьогодні сонячна", "Крістіан");
        Printer.Message msg2 = new Printer.Message("Ходімо на пікнік", null);
        Printer.Message msg3 = new Printer.Message(null, null);

        printer.print(msg1);
        printer.print(msg2);
        printer.print(msg3);
    }
}
