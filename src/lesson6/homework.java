package lesson6;

import java.util.Scanner;

public class homework {
/*1.) Написать программу, которая считывает с консоли (Scanner) строку и выводит на консоль ее длину
2) Написать метод который будет возвращать результат склейки двух строк. например:
    вызывается метод со строками  "I love " и "Java" после этого метод вернет I love Java
3) создайте 5 методов с разной сигнатурой, но с одинаковым названием метода
4) напишите класс с методами для конвертации градусы цельсия в фаренгейты и метод для конвертации фаренгейтов в цельсия
            (Фаренгейт — 32) : 1,8 = Цельсий Пример: (50°F - 32) : 1,8 = 10°C
    Цельсий х 1,8 + 32 = Фаренгейт Пример: 10°C x 1,8 + 32 = 50°F
5) напишите метод для получения суммы трех чисел*/



    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
      //  System.out.println("Введите слово");
       // String name = scanner.nextLine();
       // System.out.println("Длина стороки - " + name.length());
        System.out.println(concat("I love " , "Java"));


    }
    public static String concat ( String first, String second) {
        return first + second;


        }
        //Сигнатуры метода
    public static int name1() {
        return 1+1;
    }

    public static int name1 (double) {
        return 2.5 + 3.2;
    }
    public static int name1 (String) {
        return "Hello";
    }

    public static void name1 (String, int) {
        return "hello", 5;
    }

    public static void name1 (short) {
        return 6+3;
    }
}
 // метод для получения 3 чисел

public static int numbers(int first, int second, int thirth) {
    return first + second + thirth;
}

