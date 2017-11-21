package ge.edu.sangu.lesson07;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static Path relativePath(String relative) {
        return FileSystems.getDefault().getPath("resources/" + relative);
    }

    public static List<String> readFile(String filename) {
        List<String> a = null;
        try {
            a = Files.readAllLines(relativePath(filename), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return a;
    }

    public static Department findDepartmentById(List<Department> departments, Integer departmentId) {
        for (Department department : departments) {
            if (Objects.equals(department.id, departmentId)) {
                return department;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Department> departments = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        List<String> e = readFile("employees.txt");
        e.remove(0);
        List<String> d = readFile("departments.txt");
        d.remove(0);
        for (String dep : d) {
            List<String> row = Arrays.asList(dep.split(";"));

            departments.add(new Department(row));
        }

        for (String emp : e) {
            List<String> row = Arrays.asList(emp.split(";"));

            Employee employee = new Employee(row);
            employee.department = findDepartmentById(departments, employee.departmentId);
            employees.add(employee);
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}