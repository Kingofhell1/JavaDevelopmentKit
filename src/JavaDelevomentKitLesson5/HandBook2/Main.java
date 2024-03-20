package JavaDelevomentKitLesson5.HandBook2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                HandBook employeeDirectory = new HandBook();
//                employeeDirectory.addEmployee(new Employee1(1001, "555-1234", "Alice", 5));
//                employeeDirectory.addEmployee(new Employee1(1002, "555-5678", "Bob", 3));
//                employeeDirectory.addEmployee(new Employee1(1003, "555-9876", "Charlie", 7));

                new HandBookGUI(employeeDirectory);
            }
        });
    }
}
