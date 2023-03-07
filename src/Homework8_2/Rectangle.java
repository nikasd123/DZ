package Homework8_2;

public class Rectangle extends Figures{
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void perimetr() {
        if (sideA < 0 || sideB < 0) {
            System.out.printf("Rectangle with values %f, %f can`t to be\n", sideA, sideB);
        } else {
            final double p = 2 * (sideA + sideB);
            System.out.println("Rectangle area is: " + p);
        }
    }

    @Override
    public void area() {
        if (sideA < 0 || sideB < 0) {
            System.out.printf("Triangle with values %f, %f, %f can`t to be\n", sideA, sideB);
        } else {
            final double a = sideA * sideB;
            System.out.println("Rectangle area is: " + a);
        }
    }
}
