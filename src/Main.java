import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            twoDimArrayPlusValue();
            chessBoardBW();
        }

//    1. Создать двухмерный массив из целых чисел.
//    С помощью циклов "пройти" по всему массиву и увеличить каждый
//    элемент на заданное число. Пусть число, на которое будет
//    увеличиваться каждый элемент, задается из консоли.
        static void twoDimArrayPlusValue() {
            int[][] twoDimArray = new int[3][3];
            Scanner inputValue = new Scanner(System.in);
            System.out.print("Введите число на которое будет прибавляться значения" +
                    " в массиве: ");
            int inputPlusValue = inputValue.nextInt(); // число на которое будет прибавляться значения
            int arrayCounter = 0;

            for (int rows = 0; rows < twoDimArray.length; rows++){
                for (int cols = 0; cols < twoDimArray[rows].length; cols++){
                    twoDimArray[rows][cols] = arrayCounter++;
                }
            }

            System.out.println("Original array is: " + Arrays.deepToString(twoDimArray));

            for (int i = 0; i < twoDimArray.length; i++) {
                for (int j = 0; j < twoDimArray[i].length; j++){
                    twoDimArray[i][j] += inputPlusValue;
                }
            }

            System.out.println("Array after modify: " + Arrays.deepToString(twoDimArray));
        }


//    2. Шахматная доска.
//    Создать программу для раскраски шахматной доски с помощью цикла.
//    Создать двумерный массив String'ов 8х8. С помощью циклов задать
//    элементам циклам значения B(Black) или W(White). Результат работы
//    программы:
//    W B W B W B W B
//    B W B W B W B W
//    W B W B W B W B
//    B W B W B W B W
//    W B W B W B W B
//    B W B W B W B W
//    W B W B W B W B
//    B W B W B W B W
        static void chessBoardBW(){
        char[][] chessBoard = new char[8][8];
        char[] cells = {'B', 'W'};

        for (int i = 0, symbolCounter = 0; i < chessBoard.length; i++){
            for (int j = 0; j < chessBoard[i].length; j++){
                chessBoard[i][j] = cells[symbolCounter];
                symbolCounter = (symbolCounter == 0) ? ++symbolCounter : --symbolCounter;
            }
        }
        System.out.print(Arrays.deepToString(chessBoard));
    }
}