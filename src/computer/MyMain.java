package computer;

public class MyMain {
    public static void main(String[] args) {
        Ram ram = new Ram("Kingston", 8);
        Ssd ssd = new Ssd("Samsung", 256, "Internal");

        Computer myComputer = new Computer(ram, ssd, "MSI", 15000);


        myComputer.computerInfo();
        System.out.println();
        myComputer.fullComputerInfo();
    }
}
