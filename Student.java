import java.util.Scanner;

public class Student extends Person {
    private boolean studentType;
    private boolean regType;
    private double GPA;
    private String departmentName;

    public void userInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter true for Faculty or false for Student: ");
        boolean personType = scanner.nextBoolean();

        System.out.print("Enter your Department name: ");
        scanner.nextLine();
        String departmentName = scanner.nextLine();

        System.out.print("Enter your GPA: ");
        double GPA = scanner.nextDouble();

        System.out.print("Enter true for Undergraduate or false for graduate student: ");
        boolean studentType = scanner.nextBoolean();

        System.out.print("Enter true for FULL TIME or false for PART TIME student: ");
        boolean regType = scanner.nextBoolean();

        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setPersonType(personType);
        setDepartmentName(departmentName);
        setGPA(GPA);
        setStudentType(studentType);
        setRegType(regType);
    }

    public void printInfo() {
        System.out.println("Welcome to SYSC2004 Lab 04");
        System.out.println("Apparently you are a student!");
        System.out.println("Student name is: " + getFirstName() + " " + getLastName());
        System.out.println("Student is " + getAge() + " years old");
        System.out.println("Student is in " + getDepartmentName() + " and their GPA is: " + getGPA());

        String studentTypeString = getStudentType() ? "full time" : "part time";
        String undergraduateString = getRegType() ? "undergraduate" : "graduate";
        System.out.println("Student is a " + studentTypeString + " " + undergraduateString + " student");
    }

    public Student() {
        super();
        studentType = true;
        regType = true;
        GPA = 4.0;
        departmentName = "DefaultDep";
    }

    public Student(String firstName, String lastName, String departmentName, double GPA, boolean studentType, boolean regType) {
        super();
        setFirstName(firstName);
        setLastName(lastName);
        setPersonType(true);
        this.departmentName = departmentName;
        this.GPA = GPA;
        this.studentType = studentType;
        this.regType = regType;
    }
    public boolean getStudentType() {
        return studentType;
    }

    public boolean getRegType() {
        return regType;
    }

    public double getGPA() {
        return GPA;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setStudentType(boolean studentType) {
        this.studentType = studentType;
    }

    public void setRegType(boolean regType) {
        // Implement the logic to set the regType
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public boolean getContractType() {
        return false; // Replace with the actual implementation
    }

    public void setContractType(boolean contractType) {
        // Implement the logic to set the contractType
    }
}