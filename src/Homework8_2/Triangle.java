package Homework8_2;

public class Triangle extends Figures{
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
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
            System.out.printf("Triangle with values: %f, %f, %f can`t to be...\n", sideA, sideB, sideC);
            isCanBe = false;
        }
        return isCanBe;
    }

    @Override
    public void perimetr() {
        if(isCanToBe(sideA, sideB, sideC)) {
            final double p = sideA + sideB + sideC;
            System.out.print("Triangle perimetr is: " + p + "\n");
        }
    }


    @Override
    public void area() {
        if(isCanToBe(sideA, sideB, sideC)){
            final double halfP = (sideA + sideB + sideC) / 2;
            final double a = Math.sqrt(halfP * ((halfP - sideA) * (halfP - sideB) * (halfP - sideC)));
            System.out.print("Triangle area is: " + a + "\n");
        }
    }
}
