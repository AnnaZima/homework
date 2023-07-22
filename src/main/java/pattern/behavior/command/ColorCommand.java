package pattern.behavior.command;

public class ColorCommand implements Command{
    Printer printer;

    public ColorCommand(Printer printer) {
        this.printer = printer;
    }
    @Override
    public void execute() {
        printer.colorPrinting();
    }
}
