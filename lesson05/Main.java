package ge.edu.sangu.lesson05;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void getMapOutOfTwoLists() {
        List<Integer> keys = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<String> values = new ArrayList<>(Arrays.asList("a", "b", "c"));

        Map example = new HashMap();

        for (int i = 0; i < keys.size(); i++) {
            example.put(keys.get(i), values.get(i));
        }

        System.out.println(example.get(2));
    }

    public static void getInfoAboutAnimal(Animal animal) {
        animal.outputBasicInfo();
        animal.saySomething();
    }

    public static void animals() {
        Dog dog = new Dog("Pluto");
        Cat cat = new Cat("Tommy");

        getInfoAboutAnimal(dog);
        getInfoAboutAnimal(cat);
    }

    public static void main(String[] args) {

        //task a
        getMapOutOfTwoLists();

        //task b
        animals();
    }
}
