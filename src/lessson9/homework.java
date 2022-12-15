package lessson9;



//В первом подъезде квартиры с 1 по 20. Во втором с 21 по 48.
// В третьем с 49 по 90. Пользователь вводит номер квартиры.
// Программа должна указать в каком подъезде находится данная квартира.

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner (System.in);
        System.out.println("Введите номер квартиры");
        int number = scanner.nextInt();

        switch (number) {
            case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20  -> System.out.println("1 Подьезд");
            case 21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,
                    37,38,39,40,41,42,43,44,45,46,47,48-> System.out.println("2 Подьезд");
            default -> System.out.println("3 Подьезд");

            }*/


// Переменная num может принимать 4 значения: 1, 2, 3 или 4.
// Если она имеет значение '1', то в переменную result запишем 'зима',
// если имеет значение '2' – 'весна' и так далее. Решите задачу через switch-case.



      /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер");
        int number = scanner.nextInt();
        switch (number) {
            case 1 -> System.out.println("Зима");
            case 2 -> System.out.println("Весна");
            case 3 -> System.out.println("Лето");
            case 4 -> System.out.println("Осень");
            default -> System.out.println("Нет такого");

        }*/

//В переменной month лежит какое-то число из интервала от 1 до 12.
// Определите в какую пору года попадает этот месяц (зима, лето, весна, осень).


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер");
        int number = scanner.nextInt();
        switch (number) {
            case 1,2,3 -> System.out.println("Зима");
            case 4,5,6 -> System.out.println("Весна");
            case 7,8,9 -> System.out.println("Лето");
            case 10,11,12 -> System.out.println("Осень");
            default -> System.out.println("error");

        }

        }

    }

