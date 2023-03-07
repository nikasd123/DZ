package HomeWork8_work;

public class Director extends Person implements Post{
    public Director(String name, String surName, int age) {
        super(name, surName, age);
    }

    @Override
    public void postInfo() {
        System.out.println("I`m an director");
    }
}
