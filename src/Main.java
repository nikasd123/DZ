import java.util.*;

public class Main {
    public static void main(String[] args) {
        Task_1();
        Task_2();
        Task_3();
        Task_4();
    }


//    1. Создайте массив целых чисел. Напишете программу, которая выводит
//    сообщение о том, входит ли заданное число в массив или нет. Пусть
//    число для поиска задается с консоли (класс Scanner).
    static void Task_1(){
        Scanner importCheckNum = new Scanner(System.in);
        int[] numbers = {1, 3, 5, 7};
        System.out.println("Task1");

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
        System.out.println("Task2");

        int[] numbers = {1, 25, 50, 75, 100};
//        int[] numbersNew = new int[numbers.length-1];
        Scanner removeNumber = new Scanner(System.in);

        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.print("Type a number that you want to delete: ");
        int deleteNumber = removeNumber.nextInt();

        if (Arrays.binarySearch(numbers, deleteNumber) < 0){
            System.out.println("This number does`n exist in array");
        } else {
            int[] numbersNew = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++){
                if (numbers[i] != deleteNumber) {
                    numbersNew[i] =  numbers[i];
                }
            }
            System.out.println("The new Array is " + Arrays.toString(numbersNew));
        }
    }


//    3. Создайте и заполните массив случайным числами и выведете
//    максимальное, минимальное и среднее значение.
//    Для генерации случайного числа используйте метод Math.random().
//    Пусть будет возможность создавать массив произвольного
//    размера. Пусть размер массива вводится с консоли.

    static void Task_3() {
        System.out.println("Task3");

        Scanner amountOfArray = new Scanner(System.in);
        System.out.print("Type amount of array: ");
        int[] numbers = new int[amountOfArray.nextInt()];

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = new Random().nextInt(100);
        }
        System.out.print("Our array is ");
        System.out.print((Arrays.toString(numbers)));

        System.out.println();

        double max = Arrays.stream(numbers).max().getAsInt();
        double min = Arrays.stream(numbers).min().getAsInt();
        double avg = Arrays.stream(numbers).average().getAsDouble();

        System.out.println(min + " is minimum number of array");
        System.out.println(max + " is maximum number of array");
        System.out.println(avg + " is average number of array");
    }


//        4. Создайте 2 массива из 5 чисел.
//        Выведите массивы на консоль в двух отдельных строках.
//        Посчитайте среднее арифметическое элементов каждого массива и
//        сообщите, для какого из массивов это значение оказалось больше (либо
//        сообщите, что их средние арифметические равны).
    static void Task_4() {

        System.out.println("Task 4");
        int[] numbers1 = new int[5];
        int[] numbers2 = new int[5];
        int summaOfNumbers1 = 0;
        int summaOfNumbers2 = 0;

        for (int index = 0; index < numbers1.length; index++) {
            numbers1[index] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(numbers1));
        for (int index = 0; index < numbers1.length; index++) {
            numbers2[index] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(numbers2));

        // Сумма первого массива
        for (int summa1 = 0; summa1 < numbers1.length; summa1++){
            summaOfNumbers1 += numbers1[summa1];
        }
        // Сумма второго массива
        for (int summa2 = 0; summa2 < numbers2.length; summa2++){
            summaOfNumbers2 += numbers2[summa2];
        }

        int averageValueOfNumbers1 = summaOfNumbers1 / numbers1.length;
        int averageValueOfNumbers2 = summaOfNumbers2 / numbers2.length;
        System.out.println("Среднее значение первого массива: " + averageValueOfNumbers1);
        System.out.println("Среднее значение второго массива: " + averageValueOfNumbers2);

        if (averageValueOfNumbers1 > averageValueOfNumbers2){
            System.out.println("Среднее значение первого массива больше второго");
        } else if (averageValueOfNumbers1 < averageValueOfNumbers2) {
            System.out.println("Среднее значение второго массива больше первого");
        } else {
            System.out.println("Среднее значение первого и второго массива равны");
        }
    }
}
