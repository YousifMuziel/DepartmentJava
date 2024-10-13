public abstract class Person {
    private boolean personType;
    private int age;
    private String lastName;
    private String firstName;

    public abstract void userInput(); {
        // Empty method
    }

    public void printInfo() {
        // Empty method
    }

    public Person() {
        firstName = "StudentFirst";
        lastName = "StudentLast";
        age = 0;
        personType = false;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected void setPersonType(boolean personType) {
        this.personType = personType;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    public boolean getPersonType() {
        return personType;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getDepartmentName() {
        return null; // Replace with the actual implementation
    }

    public void setDepartmentName(String departmentName) {
        // Implement the logic to set the departmentName
    }
}
