package computer;

public class Computer {
    Ram kingstonRam;
    Ssd samsungSsd;
    String model;
    int cost;

    public Computer(String model, int cost) {
        this.model = model;
        this.cost = cost;
    }

    public Computer(Ram kingstonRam, Ssd samsungSsd, String model, int cost) {
        this.kingstonRam = kingstonRam;
        this.samsungSsd = samsungSsd;
        this.model = model;
        this.cost = cost;
    }


    public void computerInfo() {
        System.out.println("Computer model is: " + model);
        System.out.println("Computer Cost is: " + cost);
    }

    public void fullComputerInfo() {
        System.out.println("Computer model is: " + model);
        System.out.println("Computer Cost is: " + cost);
        kingstonRam.ramInfo();
        samsungSsd.ssdInfo();
    }
}
