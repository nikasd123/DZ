import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task_1();
        Task_2();
    }

    static void Task_1(){  // задание 1. Проверка наличия числа в массиве
        int[] numbers = {1, 3, 5, 7};
        Scanner checkNum = new Scanner(System.in);
        System.out.print("Print random number in array 0 - 10: ");
        int checkNumbers = checkNum.nextInt(); // ввод нужного числа

        switch (checkNumbers) {
            case 1 -> System.out.println("Your number is in array - 1");
            case 3 -> System.out.println("Your number is in array - 3");
            case 5 -> System.out.println("You number is in array - 5");
            case 7 -> System.out.println("You number is in array - 7");
            default -> System.out.println("Your number is not in array");
        }
    }
    static void Task_2() {

    }
}