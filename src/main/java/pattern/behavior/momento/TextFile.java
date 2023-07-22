package pattern.behavior.momento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TextFile {
    private List<String> content = new ArrayList<>();
    private LocalDateTime dateTime;
    private int version;

    public void setVersionAndDateTime(int version, String content) {
        this.content.add(content);
        this.version = version;
        this.dateTime = LocalDateTime.now();
    }

    public Save save() {
        return new Save(version);
    }

    public void load(Save save) {
        version = save.getVersion();
        dateTime = save.getDate();
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "content=" + content +
                ", dateTime=" + dateTime +
                ", version=" + version +
                '}';
    }
}
