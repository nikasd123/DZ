package homework7;

public class Triangle extends Figures {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private static boolean isCanToBe(double sideA, double sideB, double sideC) {
        final double sumAB = sideA + sideB; //сумма сторон АВ
        final double sumBC = sideC + sideB; //сумма сторон ВС
        final double sumAC = sideC + sideA; //сумма сторон АС
        boolean isCanBe = true;

        if (sumAC < sideB || sumAB < sideC || sumBC < sideA) {
            System.out.printf("Triangle with values: %f, %f, %f can`t to be...", sideA, sideB, sideC);
            isCanBe = false;
        }
        return isCanBe;
    }

    public double area() {
        if(isCanToBe(sideA, sideB, sideC)){
            final double halfP = (sideA + sideB + sideC) / 2;
            final double a = Math.sqrt(halfP * ((halfP - sideA) * (halfP - sideB) * (halfP - sideC)));
            System.out.print("Triangle area is: " + a);
            return a;
        } else return 0;
    }

    public double perimetr() {
        if(isCanToBe(sideA, sideB, sideC)) {
            final double p = sideA + sideB + sideC;
            System.out.print("Triangle perimetr is: " + p);
            return p;
        } else return 0;
    }
}