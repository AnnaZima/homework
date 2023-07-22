package pattern.behavior.command;

public class DuplexCommand implements Command{
    Printer printer;

    public DuplexCommand(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void execute() {
        printer.duplexPrinting();
    }
}
