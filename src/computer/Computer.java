package computer;

public class Computer {
    Ram kingstonRam = new Ram("Kingston", 8);
    Ssd samsungSsd = new Ssd("Samsung", 256, "Internal SSD drive");

    String model;
    int cost;

    public Computer(String computerModel, int computerCost) {
        model = computerModel;
        cost = computerCost;
    }

    public void computerInfo(){
        System.out.println("Computer model is: " + model);
        System.out.println("Computer Cost is: " + cost);
    }
    public void fullComputerInfo(){
        System.out.println("Computer model is: " + model);
        System.out.println("Computer Cost is: " + cost);
        kingstonRam.ramInfo();
        samsungSsd.ssdInfo();
    }
}
