package ge.edu.sangu.lesson09;

public class Lecturer {
    private Integer age;
    private String firstName;
    private String lastName;
    private String faculty;


    public Lecturer(int age, String firstName, String lastName, String faculty) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
    }

    public Lecturer(String name) {
        this.firstName = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
