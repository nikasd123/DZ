package homeworkCars;

public class Main {
    public static void main(String[] args) {
        System.out.println("First array of cars:");
        firstArrayOfCars();
        System.out.println("\nSecond array of cars:");
        secondArrayOfCars();
    }

    public static void firstArrayOfCars(){ //первый вариант внесения значений в массив
        Car[] firstCars = new Car[2];
        firstCars[0] = new Car("BMW", "Red", 2020, 250);
        firstCars[1] = new Car("Opel", "White", 2021, 250);

        //Проверка скоростей
        if (firstCars[0].getMaxSpeed() > firstCars[1].getMaxSpeed()) {
            firstCars[0].carInfo();
        } else if (firstCars[0].getMaxSpeed() < firstCars[1].getMaxSpeed()){
            firstCars[1].carInfo();
        }
        else for (int i = 0; i < firstCars.length; i++) { //условие на равные скорости
                firstCars[i].carInfo();
                if (i == 0) //выводить текст только между двумя элементами массива
                    System.out.println("\nCars max speed are equals, that`s a reason to print a both of cars\n");
            }
    }

    public static void secondArrayOfCars() { //второй вариант внесения значений в массив
        Car[] secondCars = {new Car("Mercedes", "Black", 2019, 150),
                            new Car("Tesla", "Red", 2018, 250)};

        //Проверка скоростей
        if (secondCars[0].getMaxSpeed() > secondCars[1].getMaxSpeed()) {
            secondCars[0].carInfo();
        } else if (secondCars[0].getMaxSpeed() < secondCars[1].getMaxSpeed()) {
            secondCars[1].carInfo();
        } else for (int i = 0; i < secondCars.length; i++) { //условие на равные скорости
            secondCars[i].carInfo();
            if (i == 0) //выводить текст только между двумя элементами массива
                System.out.println("\nCars max speed are equals, that`s a reason to print a both of cars\n");
        }
    }
}
