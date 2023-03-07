package HomeWork8_work;

public class Accountant extends Person implements Post{
    public Accountant(String name, String surName, int age) {
        super(name, surName, age);
    }

    @Override
    public void postInfo() {
        System.out.println("I`m an accountant");
    }
}
