package pattern.behavior.command;

public class Runner {
    public static void main(String[] args) {
        Printer printer = new Printer();
        OfficeWorker officeWorker = new OfficeWorker(
                new ColorCommand(printer),
                new DuplexCommand(printer),
                new ScannerCommand(printer)
        );

        officeWorker.colorPrintRecord();
        officeWorker.duplexPrintRecord();
        officeWorker.scannerPrintRecord();

    }
}
