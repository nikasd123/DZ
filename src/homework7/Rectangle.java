package homework7;

public class Rectangle extends Figures{
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double area(){
        final double a = sideA * sideB;
        System.out.print("Rectangle area is: " + a);
        return a;
    }
    public double perimetr(){
        final double p = 2 * (sideA + sideB);
        System.out.print("Rectangle perimetr is: " + p);
        return p;
    }
}
