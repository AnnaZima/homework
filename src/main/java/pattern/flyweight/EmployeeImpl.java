package pattern.flyweight;

public abstract class EmployeeImpl implements Employee{
    String name;
    String specialty;

    public EmployeeImpl(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }



    @Override
    public void toWork() {
        System.out.println(name + " - " + specialty + " выполняет свои трудовые обязанности");
    }
}
