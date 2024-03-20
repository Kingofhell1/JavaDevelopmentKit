package JavaDelevomentKitLesson5.HandBook2;

public class Employee1 {
    private int employeeId;
    private String phoneNumber;
    private String name;
    private int experience;

    public Employee1(int employeeId, String phoneNumber, String name, int experience) {
        this.employeeId = employeeId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "табельный номер = " + employeeId +
                ", номер телефона = '" + phoneNumber + '\'' +
                ", имя = '" + name + '\'' +
                ", стаж = " + experience;
    }
}
