package pattern.behavior.command;

public class OfficeWorker {
    Command colorPrint;
    Command duplexPrint;
    Command scannerPrint;

    public OfficeWorker(Command colorPrint, Command duplexPrint, Command scannerPrint) {
        this.colorPrint = colorPrint;
        this.duplexPrint = duplexPrint;
        this.scannerPrint = scannerPrint;
    }

    public void colorPrintRecord() {
        colorPrint.execute();
    }

    public void duplexPrintRecord () {
        duplexPrint.execute();
    }

    public void scannerPrintRecord() {
        scannerPrint.execute();
    }

}
