package pattern.behavior.momento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Save {
    private final int version;
    private final LocalDateTime date;
    private List<String> content = new ArrayList<>();

    public int getVersion() {
        return version;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public List<String> getContent() {
        return content;
    }

    public Save(int version) {
        this.version = version;
        date = LocalDateTime.now();

    }
}
