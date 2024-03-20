package JavaDelevomentKitLesson5.HandBook2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
public class HandBookGUI extends JFrame{
    private HandBook handBook;
    private JTextField inputField;
    private JTextArea outputArea;

    public HandBookGUI(HandBook handBook) {
        this.handBook= handBook;

//        frame = new JFrame("Справочник сотрудников");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        inputField = new JTextField(20);
        JButton searchByExperienceButton = new JButton("Поиск сотрудника по стажу");
        JButton searchByPhoneNumberButton = new JButton("поиск по имени");
        JButton searchByEmployeeNumberButton = new JButton("Поиск по id сотрудника");
        JButton addEmployeeButton = new JButton("Добавить сотрудника");
//        outputArea = new JTextArea(10, 40);
//        outputArea.setEditable(false);

        JPanel panel = new JPanel();
//        panel.add(new JLabel("Введите стаж "));
//        panel.add(inputField);
        panel.add(searchByExperienceButton);
        panel.add(searchByPhoneNumberButton);
        panel.add(searchByEmployeeNumberButton);
        panel.add(addEmployeeButton);
        add(panel);
        setTitle("Справочник сотрудников");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        searchByExperienceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int experience = Integer.parseInt(JOptionPane.showInputDialog("Введите опыт для поиска: "));
                List<Employee1> result = handBook.searchByExperience(experience);
                showResults1(result);
            }
        });

        searchByPhoneNumberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog("Введите имя для поиска: ");
               List<String> result = handBook.findPhoneNumberByName(name);
               showResults3(result);

            }
        });

        searchByEmployeeNumberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int employeeNumber = Integer.parseInt(JOptionPane.showInputDialog("Введите id сотрудника для поиска:"));
                Employee1 result = handBook.searchByEmployeeId(employeeNumber);
                showResults2(result);

            }
        });

        addEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int employeeNumber = Integer.parseInt(JOptionPane.showInputDialog("Введите номер сотрудника:"));
                String phoneNumber = JOptionPane.showInputDialog("Введите номер телефона:");
                String name = JOptionPane.showInputDialog("Введите имя:");
                int experience = Integer.parseInt(JOptionPane.showInputDialog("Введите стаж сотрудника:"));

                Employee1 newEmployee = new Employee1(employeeNumber, phoneNumber, name, experience);
                handBook.addEmployee(newEmployee);

            }
        });

//        frame.add(panel);
//        frame.add(new JScrollPane(outputArea), "Поиск");
//        frame.pack();
//        frame.setVisible(true);
    }


    //Поиск сотрудника по опыту
    private void showResults1(List<Employee1> employee1s) {
        StringBuilder sb = new StringBuilder();
        for (Employee1 employee : employee1s) {
            sb.append(employee.toString()).append("\n");

        }
        if (employee1s != null) {
            JOptionPane.showMessageDialog(this, sb.toString());
        }
        else {
            JOptionPane.showMessageDialog(this, "Сотрудник не найден");
        }
    }
    //Поиск сотрудника по id
    private void showResults2(Employee1 employee) {
        if (employee != null) {
            JOptionPane.showMessageDialog(this, employee.toString());
        } else {
            JOptionPane.showMessageDialog(this, "Сотрудник не найден");
        }
    }
    //Поиск сотрудника по имени
    private void showResults3(List<String> result) {
        StringBuilder sb = new StringBuilder();
        for (String phone : result) {
            sb.append("Phone number: ").append(phone).append("\n");
        }
        if (result != null){
            JOptionPane.showMessageDialog(this, sb.toString());
        }
        else{
            JOptionPane.showMessageDialog(this, "Сотрудник не найден");
        }
    }
//    private void show4(){
//        JOptionPane.showMessageDialog(this, "Сотрудник успешно добавлен");
//    }
//    private void showEmployee(){
//        JOptionPane.showMessageDialog(this, "Сотрудник не найден");
//    }
}
