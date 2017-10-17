package ge.edu.sangu.lesson04;

public class Human {
    String name;
    int age;
    String gender;
    int height;
    double weight;
    Car car;

    public Human(String name, int age, String gender, int height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + ": "
                + gender + ", "
                + Integer.toString(age) + " years old. "
                + Integer.toString(height) + "sm, "
                + Double.toString(weight) + " kg.";
    }

    public void buyCar(Car car) {
        this.car = car;
    }

    public void drive(){
        System.out.println(name + " is driving " + car);
    }
}
