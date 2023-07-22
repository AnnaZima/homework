package pattern.behavior.interpreter;

public class AndColor implements ColorDeterminer {
    private ColorDeterminer color1;
    private ColorDeterminer color2;

    public AndColor(ColorDeterminer color1, ColorDeterminer color2) {
        this.color1 = color1;
        this.color2 = color2;
    }

    @Override
    public boolean determiner(String color) {
        return color1.determiner(color)&& color2.determiner(color);
    }


}
