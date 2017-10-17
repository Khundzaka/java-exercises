package ge.edu.sangu.lesson03;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(
                "გიორგი",
                "ხუნძაკიშვილი",
                LocalDate.of(1996, 3, 16),
                "ქართული უნივერსიტეტი"
        );

        System.out.println(s.age());
    }
}
