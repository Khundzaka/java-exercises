package ge.edu.sangu.lesson07;

import java.util.List;

public class Department {
    public Integer id;
    public String name;
    public String address;


    public Department(List<String> row) {
        this.id = Integer.parseInt(row.get(0));
        this.name = row.get(1);
        this.address = row.get(2);
    }

    @Override
    public String toString() {
        return this.name + " (" + address + ")";
    }
}
