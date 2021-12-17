package Inheritance;

// extends keyword forms an inheritance relationship between the Person parent/base/superclass and
// the Employee child/derived/subclass that inherits the members (fields and methods) of the Person class:
public class Employee extends Person {
    private String employeeId;
    private String title;

    public Employee() {
        //super will call the constructor of the superclass (Person constructor that takes a String name parameter)
        super("Luz");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
