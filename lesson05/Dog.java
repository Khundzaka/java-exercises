package ge.edu.sangu.lesson05;

public class Dog implements Animal {
    private String speak = "Woof";
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void saySomething() {
        System.out.println(speak);
    }

    @Override
    public void outputBasicInfo() {
        System.out.println(name + " is a dog.");
        System.out.println("Dog is a domestic animal. Protects a house. Considered as best friend of human");
    }
}
