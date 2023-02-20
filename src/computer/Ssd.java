package computer;

public class Ssd {
    String name;
    int size;
    String type;

    public Ssd(String ssdName, int ssdSize, String ssdType){
        name = ssdName;
        size = ssdSize;
        type = ssdType;
    }

    public void ssdInfo (){
        System.out.println("SSD name is: " + name);
        System.out.println("SSD size is: " + size + "Gb");
        System.out.println("SSD type is: " + type);
    }
}
