package pattern.behavior.visitor;

public class Document extends Element {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                '}';
    }


}
