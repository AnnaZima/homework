package pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        EmpFactory empFactory = new EmpFactory();
        List<Employee> list = new ArrayList<>();
        list.add(empFactory.getEmp("Игорь", "driver"));
        list.add(empFactory.getEmp("Олег", "driver"));
        list.add(empFactory.getEmp("Егор", "driver"));
        list.add(empFactory.getEmp("Петр", "driver"));
        list.add(empFactory.getEmp("Алексей", "driver"));

        list.add(empFactory.getEmp("Елена", "teacher"));
        list.add(empFactory.getEmp("Ольга", "teacher"));
        list.add(empFactory.getEmp("Свтелана", "teacher"));
        list.add(empFactory.getEmp("Олеся", "teacher"));

        for (Employee emp: list) {
            emp.toWork();
        }



    }
}
