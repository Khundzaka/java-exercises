package ge.edu.sangu.lesson03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String university;


    public Student(String firstName, String lastName, LocalDate birthDate, String university) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.university = university;
    }

    public int age(){
        LocalDateTime now = LocalDateTime.now();
//        LocalDate birthDate = LocalDate.of(1996, 3, 16);
        Period diff = Period.between(birthDate, now.toLocalDate());
        return diff.getYears();
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
