package pattern.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class Child implements Participant{
    Mediator mediator;
    private String thoughts;
    private List<String> understand;

    public List<String> getUnderstand() {
        return understand;
    }

    public Child(String thoughts, Mediator mediator) {
        this.thoughts = thoughts;
        this.mediator = mediator;

    }

    @Override
    public String speak() {
        return thoughts;
    }

    @Override
    public void listen(String msg) {
        understand = new ArrayList<>();
        understand.add(msg);
    }
}
