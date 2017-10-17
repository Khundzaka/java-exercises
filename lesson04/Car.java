package ge.edu.sangu.lesson04;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    private LocalDate year;
    private String color;

    public Car(String brand, String model, LocalDate year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = LocalDate.of(year, 1, 1);
        this.color = color;
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }
}
