package HomeWork8_work;

public class Person implements Post{
    private String name;
    private String surName;
    private int age;

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public void getInfo(){
        System.out.println("name: " + name);
        System.out.println("surname: " + surName);
        System.out.println("age: " + age);
        postInfo();
    }

    @Override
    public void postInfo() {

    }
}
