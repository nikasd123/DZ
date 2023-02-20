package computer;

public class MyMain {
    public static void main (String[] args){
        Computer myComputer = new Computer("MSI", 15000);

        myComputer.computerInfo();
        System.out.println();
        myComputer.fullComputerInfo();
    }
}
