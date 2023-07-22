package pattern.prototype;

public class Laboratory {
    Human human;

    public Laboratory(Human human) {
        this.human = human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Human cloneHuman() {
        return human.copy();
    }
}
