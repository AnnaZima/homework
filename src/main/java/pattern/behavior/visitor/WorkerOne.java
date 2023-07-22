package pattern.behavior.visitor;

public class WorkerOne implements Visitor{
    @Override
    public void visit(Element e) {
        System.out.println("вносит изменение в документ " + e);

    }
}
