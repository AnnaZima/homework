package pattern.behavior.mediator;

public class Psychologist implements Mediator{
    Child child;
    Parent parent;

    public void setChild(Child child) {
        this.child = child;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    @Override
    public void send(Participant participant) {
        String msg = participant.speak();
        if(participant instanceof Child) {
            parent.listen(msg);
        } else {
            child.listen(msg);
        }


    }
}
