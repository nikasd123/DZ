package HomeWork8_work;

public class Main {
    public static void main(String[] args) {
        getArrayOfWorkers();
    }
    public static void getArrayOfWorkers(){
        Person[] workers = {new Director("Archil", "Sikha", 34),
                            new Worker("Sergey", "Degryak", 19),
                            new Accountant("Anna", "Chelsy", 25)};

        for (int i = 0; i < workers.length; i++){
            workers[i].getInfo();
            System.out.println();
        }
    }
}