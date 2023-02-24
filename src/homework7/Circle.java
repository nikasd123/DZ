package homework7;

import java.io.*;

public class Circle extends Figures{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static boolean isCanToBe (double radius){
        boolean isCanBe = true;

        if (radius <= 0){
            System.out.printf("Circle with radius: %f can`t to be...", radius);
            isCanBe = false;
        }
        return isCanBe;
    }

    public double area() {
        if (isCanToBe(radius)) {
            final double a = Math.PI * Math.pow(radius, 2);
            System.out.print("Circle area is: " + a);
            return a;
        } else return 0;
    }

    public double perimetr(){
        if (isCanToBe(radius)) {
            final double p = 2 * Math.PI * radius;
            System.out.print("Circle perimetr is: " + p);
            return p;
        } else return 0;
    }
}

