package JavaDelevomentKitLesson5.HandBook2;


import java.util.ArrayList;
import java.util.List;

public class HandBook {
    private List<Employee1> employees;


    public HandBook() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee1 employee) {
        employees.add(employee);
    }

    public List<Employee1> searchByExperience(int experience) {
        List<Employee1> result = new ArrayList<>();
        for (Employee1 employee : employees) {
            if (employee.getExperience() == experience) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<String> findPhoneNumberByName(String targetName) {
        List<String> result = new ArrayList<>();
        for (Employee1 employee : employees) {
            if (employee.getName().equals(targetName)) {
                result.add(employee.getPhoneNumber());
            }
        }
        return result;
    }


    public Employee1 searchByEmployeeId(int employeeId) {
        for (Employee1 employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }
}


