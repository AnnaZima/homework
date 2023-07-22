package pattern.behavior.command;


public class ScannerCommand implements Command{
    Printer printer;

    public ScannerCommand (Printer printer) {
        this.printer = printer;
    }

    @Override
    public void execute() {
        printer.scanner();
    }
}
