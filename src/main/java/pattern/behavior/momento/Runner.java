package pattern.behavior.momento;

public class Runner {
    public static void main(String[] args) {
        TextFile textFile = new TextFile();
        CurrentFile currentFile = new CurrentFile();

        textFile.setVersionAndDateTime(1, "привет всем");
        currentFile.setSave(textFile.save());
        textFile.setVersionAndDateTime(2, "как дела");
        currentFile.setSave(textFile.save());
        textFile.setVersionAndDateTime(3, "всем пока");
        currentFile.setSave(textFile.save());
        System.out.println(textFile);

        textFile.load(currentFile.getSave());
        System.out.println(textFile);

    }
}
