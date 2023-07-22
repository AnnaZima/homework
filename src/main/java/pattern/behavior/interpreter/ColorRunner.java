package pattern.behavior.interpreter;

import pattern.behavior.command.ColorCommand;

public class ColorRunner {
    public static void main(String[] args) {
        ColorDeterminer isBlackOrWhite = getBlackOrWhite();
        ColorDeterminer isGrey = getGrey();
        System.out.println(isGrey.determiner("white"));
        System.out.println(isBlackOrWhite.determiner("black"));

    }
    public static ColorDeterminer getBlackOrWhite () {
        ColorDeterminer black = new TerminalColor("black");
        ColorDeterminer white = new TerminalColor("white");
        return new OrColor(black, white);
    }

    public static ColorDeterminer getGrey() {
        ColorDeterminer black = new TerminalColor("black");
        ColorDeterminer white = new TerminalColor("white");
        return new AndColor(black, white);
    }

}
