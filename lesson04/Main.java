package ge.edu.sangu.lesson04;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic", 2016, "red");
        Human man = new Human("Nick", 18, "male", 178, 70.3);

        System.out.println(man);

        man.buyCar(car);
        man.drive();
    }
}
