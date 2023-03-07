package HomeWork8_work;

public class Worker extends Person implements Post{
    public Worker(String name, String surName, int age) {
        super(name, surName, age);
    }

    @Override
    public void postInfo() {
        System.out.println("I`m an employer");
    }
}
