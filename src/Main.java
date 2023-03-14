import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String docNumber = "5552 AbC 9671 lGc 1a2b";
//        StringBuilder docNumber = new StringBuilder("8412 Fpr 9671 lGc 9f9J");
        System.out.println("Source document number is: " + docNumber);

        // First condition of Task
        deleteNumbers(docNumber);

        // Second condition of Task
        lettersToStars(docNumber);

        // Third condition of Task
        lowerSlashLetters(docNumber);

        // Fourth condition of Task
        upperSlashLetters(docNumber);

        // Five condition of Task
        isContainAbc(docNumber);

        // Six condition of Task
        startWithFive(docNumber);

        // Seven condition of Task
        endWithAb(docNumber);
    }

    public static void deleteNumbers(String docNumber){
        // Вывести на экран в одну строку два первых блока по 4 цифры.

        System.out.print(docNumber.substring(0, 4).concat(" " + docNumber.substring(9, 13)));
        System.out.println();
    }

    public static void lettersToStars(String docNumber){
//        Вывести на экран номер документа, но блоки из трех букв заменить
//        на *** (каждая буква заменятся на *).

        String replacedSymbols = docNumber.replaceAll("[a-zA-Z]", "*");
        System.out.println(replacedSymbols);
    }

    public static void lowerSlashLetters(String docNumber) {
//        Вывести на экран только одни буквы из номера документа в
//        формате yyy/yyy/y/y в нижнем регистре.

        // String splitStringArray = Arrays.toString(docNumber.split(" "));
        System.out.println(String.format("%s/%s/%s/%s", docNumber.substring(5, 8),
                docNumber.substring(14, 17),
                docNumber.charAt(19),
                docNumber.charAt(21)).toLowerCase());
    }

    public static void upperSlashLetters(String docNumber){
        StringBuilder document = new StringBuilder(docNumber);
        System.out.printf(String.format("Letters: %s/%s/%s/%s\n", document.substring(5, 8),
                document.substring(14, 17),
                document.charAt(19),
                document.charAt(21)).toUpperCase());
    }

    public static void isContainAbc(String docNumber){
//        Проверить содержит ли номер документа последовательность abc и
//        вывеcти сообщение содержит или нет(причем, abc и ABC считается
//        одинаковой последовательностью).
        final String lowerDocNumber = docNumber.toLowerCase();
        if (lowerDocNumber.contains("abc")){
            System.out.println("Queue of symbols \"abc\" is exist");
        } else System.out.println("Queue of symbols abc doesn`t exist");
    }

    public static void startWithFive(String docNumber){
//    Проверить начинается ли номер документа с последовательности
//    555

    String startWith = String.valueOf(docNumber.startsWith("555"));
        System.out.println("Document Number start with 555? " + startWith);
    }

    public static void endWithAb(String docNumber){
//        Проверить заканчивается ли номер документа на
//        последовательность 1a2b.

        String endWith = String.valueOf(docNumber.endsWith("1a2b"));
        System.out.println("Document Number start with 1a2b? " + endWith);
    }
}