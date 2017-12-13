package ge.edu.sangu.lesson09;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ExampleClassTest {
    @Test
    void shouldBeAnAdult() {
        Lecturer lecturer = new Lecturer(27, "სახელი", "გვარი", "ინფორმატიკა");
        Assertions.assertTrue(lecturer.getAge() >= 18);
    }

    @Test
    void shouldHaveAllAttributes() {
        Lecturer lecturer = new Lecturer(27, "სახელი", "გვარი", "ინფორმატიკა");
        Assertions.assertNotNull(lecturer.getAge());
        Assertions.assertNotNull(lecturer.getFaculty());
        Assertions.assertNotNull(lecturer.getFirstName());
        Assertions.assertNotNull(lecturer.getLastName());
    }

    @Test
    void shouldReturnFullName() {
        Lecturer lecturer = new Lecturer(27, "სახელი", "გვარი", "ინფორმატიკა");
        Assertions.assertEquals("სახელი გვარი", lecturer.getFullName());
    }
}
