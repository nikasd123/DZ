package Homework8_2;

public class Circle extends Figures{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

//    public static boolean isCanToBe (double radius){
//        boolean isCanBe = true;
//
//        if (radius <= 0){
//            System.out.printf("Circle with radius: %f can`t to be...", radius);
//            isCanBe = false;
//        }
//        return isCanBe;
//    }

    @Override
    public void perimetr() {
        if (radius < 0) {
            System.out.printf("Circle with %f value can`t to be\n", radius);
        } else {
            final double p = 2 * Math.PI * radius;
            System.out.println("Circle perimetr is: " + p);
        }
    }
    @Override
    public void area() {
        if (radius < 0) {
            System.out.printf("Circle with value %f can`t to be\n", radius);
        } else {
            final double a = 2 * Math.PI * Math.pow(radius, 2);
            System.out.println("Circle area is: " + a);
        }
    }
}
