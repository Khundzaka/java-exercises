package ge.edu.sangu.lesson07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Employee {
    public Integer id;
    public String firstName;
    public String lastName;
    public LocalDate birthDate;
    public Department department;
    public Integer departmentId;

    private LocalDate parseLocalDate(String str) {
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        final LocalDate dt = LocalDate.parse(str, dtf);
        return dt;
    }


    public Employee(List<String> row) {
        this.id = Integer.parseInt(row.get(0));
        this.firstName = row.get(1);
        this.lastName = row.get(2);
        this.birthDate = parseLocalDate(row.get(3));
        departmentId = Integer.parseInt(row.get(4));
    }

    @Override
    public String toString() {
        return department + ", " + firstName + ", " + lastName + ", " + getAge();
    }

    private Integer getAge() {
        LocalDateTime now = LocalDateTime.now();
        Period diff = Period.between(birthDate, now.toLocalDate());
        return diff.getYears();
    }
}
