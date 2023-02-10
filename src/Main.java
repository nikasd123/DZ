import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task_1();
        Task_2();
    }


//    1. Создайте массив целых чисел. Напишете программу, которая выводит
//    сообщение о том, входит ли заданное число в массив или нет. Пусть
//    число для поиска задается с консоли (класс Scanner).
    static void Task_1(){
        Scanner importCheckNum = new Scanner(System.in);
        int[] numbers = {1, 3, 5, 7};

        System.out.print("Input random number from 0 to 10: ");
        int checkNumber = importCheckNum.nextInt();

        if (Arrays.binarySearch(numbers, checkNumber) >= 0) {
            System.out.println(checkNumber + " is in array");
        } else {
            System.out.println(checkNumber + " is not in array");
        }
    }


//    2. Создайте массив целых чисел. Удалите все вхождения
//    заданного числа из массива.
//    Пусть число задается с консоли (класс Scanner). Если такого числа нет
//    - выведите сообщения об этом.
//    В результате должен быть новый массив без указанного числа.
    static void Task_2() {

    }
}