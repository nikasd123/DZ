package computer;

public class Ram {
    String name;
    int size;

    public Ram (String ramName, int ramSize){
        name = ramName;
        size = ramSize;
    }

    public void ramInfo(){
        System.out.println("Ram name is: " + name);
        System.out.println("Ram size is: " + size + "Gb");
    }
}
