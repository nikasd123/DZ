import java.util.Scanner;

public class OneOrTwoMain {
    public static void main(String[] args) {
        System.out.println("Введите 1 или 2");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Reverse<String, String> reverse = (String reversedWord) -> {
                    StringBuilder word = new StringBuilder(reversedWord);
                    return String.valueOf(word.reverse());
                };
                System.out.println(reverse.apply("Archil"));
                break;
            case 2:
                System.out.println("What number do u want to calculate factorial?");
                int inputNumber = scanner.nextInt();

                Factorial<Integer, Integer> factorial = (Integer result) -> {
                    int num = 1;
                    for (int i = 1; i <= inputNumber; i++) {
                        num *= i;
                    }
                    result = num;
                    return result;
                };

                System.out.println("Factorial of " + inputNumber + " is: " + factorial.apply(inputNumber));
                break;
            default:
                System.out.println("Type a number only 1 or 2.");
                break;
        }
        scanner.close();
    }

}
