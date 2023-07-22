package pattern.behavior.interpreter;

public class TerminalColor implements ColorDeterminer{
    private String data;


    public TerminalColor(String data) {
        this.data = data;
    }

    @Override
    public boolean determiner(String color) {
        return color.contains(data);
    }
}
