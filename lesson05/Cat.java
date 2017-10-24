package ge.edu.sangu.lesson05;

public class Cat implements Animal{
    private String speak = "Meow";
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void saySomething() {
        System.out.println(speak);
    }

    @Override
    public void outputBasicInfo() {
        System.out.println(name + " is a cat.");
        System.out.println("Cat is a domestic animal. Can catch rats. Loves fluffy things.");
    }
}
