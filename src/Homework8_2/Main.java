package Homework8_2;

public class Main {
    public static void main (String[] args) {
        Figures[] figures = new Figures[5];

        figures[0] = new Circle(1);
        figures[1] = new Rectangle(21, 23);
        figures[2] = new Triangle(31, 21, 111);
        figures[3] = new Circle(51);
        figures[4] = new Rectangle(21, 124);

        for (int i = 0; i < figures.length; i++) {
            figures[i].perimetr();
            figures[i].area();
            System.out.println();
        }
    }
}
