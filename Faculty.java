public class Faculty extends Person {
    private boolean contractType;
    private String departmentName;

    public void printInfo() {
        System.out.println("Welcome to SYSC2004 Lab 04");
        System.out.println("Apparently you are a faculty!");
        System.out.println("Faculty name is: " + getFirstName() + " " + getLastName());
        System.out.println("Faculty is " + getAge() + " years old");
        System.out.println("Faculty is in " + getDepartmentName());
        System.out.println("Faculty is a full time");
    }
 
    public Faculty(String firstName, String lastName, String departmentName) {
        setFirstName(firstName);
        setLastName(lastName);
        setDepartmentName(departmentName);
        setPersonType(false);
    }

    public Faculty() {
        setFirstName("FacultyFirst");
        setLastName("FacultyLast");
        setDepartmentName("DefaultDepartment");
        setPersonType(false);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void userInput() {
        // Implementation of userInput() in Faculty class (if required)
        // Leave it empty for now
    }
}
