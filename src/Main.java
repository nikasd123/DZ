public class Main {
    public static void main(String[] args) {
        Task_1();
        System.out.println();
        Task_2();
        System.out.println();
        Task_3();
        System.out.println();
        Task_4();
        System.out.println();
        System.out.println();
        Task_5();
        System.out.println();
        System.out.println();
        Task_6();
        System.out.println();
        Task_7();
    }

    static void Task_1() {
//        1) В переменную записываем число. Надо вывести на экран сколько в этом
//        числе цифр и положительное оно или отрицательное. Например, "это
//        однозначное положительное число". Достаточно будет определить, является ли
//        число однозначным, "двухзначным или трехзначным и более.

        int num = -123;

        if (num < 10 && num >= 0) {
            System.out.println("В этом числе 1 цифра, и оно положительное");
        } else if (num < 100 && num >= 10) {
            System.out.println("В этом числе 2 цифры, и оно положительное");
        } else if (num >= 100) {
            System.out.println("В этом числе 3 или более цифр, и оно положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    static void Task_2() {
//        2) Треугольник существует только тогда, когда сумма любых двух его сторон
//        больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
//        стороны предполагаемого треугольника. Требуется сравнить длину каждого
//        отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
//        окажется больше суммы двух других, то треугольника с такими сторонами не существует

        int sideA = 31;
        int sideB = 9;
        int sideC = 23;

        int sumAB = sideA + sideB; //сумма сторон АВ
        int sumBC = sideC + sideB; //сумма сторон ВС
        int sumAC = sideC + sideA; //сумма сторон АС

        if (sumAC > sideB) {
            System.out.println("По проверке суммы сторон АС к В - такой треугольник существует");
        } else {
            System.out.println("По проверке суммы сторон АС к В - такой треугольник не может существовать");
        }
        if (sumBC > sideA) {
            System.out.println("По проверке суммы сторон ВС к А - такой треугольник существует");
        } else {
            System.out.println("По проверке суммы сторон ВС к А - такой треугольник не может существовать");
        }
        if (sumAB > sideC) {
            System.out.println("По проверке суммы сторон АВ к С - такой треугольник существует");
        } else {
            System.out.println("По проверке суммы сторон АВ к С - такой треугольник не может существовать");
        }
//        Пытался сначала сделать одним блоков if\else if\else но выбирался 1 из истины. В итоге
//        всегда писало "такой треугольник может существовать". Я уверен есть менее колхозный
//        вариант кода, хотел бы увидеть разбор, либо пример других.
    }

    static void Task_3() {
//        3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
//        Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
//        10. Вывести полученное число.

        int num = 0;

        if (num > 0) {
            num++;
            System.out.println(num);
        } else if (num < 0) {
            num -= 2;
            System.out.println(num);
        } else {
            num = 10;
            System.out.println(num);
        }
    }

    static void Task_4() {
//        4) Даны 3 целых числа. Найти количество положительных чисел в исходном
//        наборе.
        int num1 = 3;
        int num2 = 5;
        int num3 = -1;
        int plusCount = 0; // кол-во положительных чисел

        if (num1 >= 0) {
            plusCount++;
        }
        if (num2 >= 0) {
            plusCount++;
        }
        if (num3 >= 0) {
            plusCount++;
        }
        System.out.printf("Всего %d положительных числа", plusCount);
    }

    static void Task_5() {
//        5) Даны 3 целых числа. Найти количество положительных и отрицательных
//        чисел в исходном наборе.
        int num1 = 3;
        int num2 = 5;
        int num3 = -1;
        int plusCount = 0; // количество положительных чисел
        int minusCount = 0; // количество отрицательных чисел

        if (num1 >= 0) {
            plusCount++;
        } else {
            minusCount++;
        }
        if (num2 >= 0) {
            plusCount++;
        } else {
            minusCount++;
        }
        if (num3 >= 0) {
            plusCount++;
        } else {
            minusCount++;
        }
        System.out.printf("Всего %d положительных числа", plusCount);
        System.out.println();
        System.out.printf("И %d отрицательных чисел", minusCount);
    }

    static void Task_6() {
//        6) Даны 2 числа. Вывести большее из них
        int num1 = 9;
        int num2 = 21;

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }

    static void Task_7() {
//        7) (Дополнительно) В переменную записываете количество программистов. В
//        зависимости от количества программистов необходимо вывести правильно
//        окончание. Например:
//            2 программиста
//            1 программиста
//            10 программистов
//            и т.д

        int programmerCount = 3; // Count of programmers

        if (programmerCount >= 5) {
            System.out.printf("%d программистов", programmerCount);
        } else {
            System.out.printf("%d программиста", programmerCount); // условие на менее пяти программистов
        }
    }
}