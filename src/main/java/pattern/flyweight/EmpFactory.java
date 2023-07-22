package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmpFactory {
    public static final Map<String, Employee> empMap = new HashMap<>();

    public Employee getEmp(String name, String specialty) {
        Employee employee = empMap.get(specialty);
        if (employee == null) {
            switch (specialty) {
                case "teacher":
                    employee = new Teacher(name, specialty);
                    break;
                case "driver":
                    employee = new Driver(name, specialty);
                    break;
                case "doctor":
                    employee = new Doctor(name, specialty);
            }
            empMap.put(specialty, employee);
        }
        return employee;
    }


}
