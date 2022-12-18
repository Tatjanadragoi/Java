package lesson10;


import java.util.Scanner;


public class homework {
    public static void main(String[] args) {
        // 1) пользователь вводит с консоли (Scanner) 2 числа (2 года)
        //написать программу, которая считает сколько годов между двумя числами високосные
        //Например//(2000,2022) -> 6 ( для простоты считайте что год високосный если
        // делится на 4 без остатка)


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый год");
        int year1 = scanner.nextInt();
        System.out.println("Введите второй год");
        int year2 = scanner.nextInt();
        int result = 0;
        for (int i = 0; i <= year1; i++) { result = (year2 - year1) / 4 +1;

            
        }

        System.out.println(result);*/


        ////2) Вывести на консоль те двузначные числа которые делятся на 4, но не делятся на 6.

      /* for (int i = 10; i <= 99; i++) {
           int res = i;
           if (res % 4 == 0 && res % 6 != 0) {
               System.out.print(res +" ");
           }

       }*/


        //4) Вывести на консоль сумму чисел от 0 до 100
        /*int res = 0;
        for (int i = 0; i <= 100; i++) {
            res += i;

        }
        System.out.println(res);*/


        //5) Вывести на консоль числа от -10 до -40.

       /* for (int i = 10; i <= 40; i++) {
            int res = i;
            System.out.println("-" +i);

        }*/


        //7) Необходимо написать программу, которая проверяет пользователя
// на знание таблицы умножения. Пользователь сам вводит два
//целых однозначных числа. Программа задаёт вопрос: результат
// умножения первого числа на второе.
//Пользователь должен ввести ответ и увидеть на экране правильно он ответил или нет. Если нет
//– показать еще и правильный результат.


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = scanner.nextInt();
        System.out.println("Введите второе число");
        int y = scanner.nextInt();
        System.out.println("Введите результат умножения обоих чисел");
        int result = scanner.nextInt();
        int result2 = x * y;
        if (result == result2) {
            System.out.println("Все верно");


        } else {
            System.out.println("Неправильно, результат равен " + result2);

        }*/




        //8) напишите программу, которая проверяет является ли число простым
//   Простое число - число которое делится только на 1 и на самого себя
//   Например число 17 - просто оно делится только на 1 и на 17
//   число 6 не простое - оно делится на 1, 2, 3 и 6
//   Подсказка - используйте цикл чтобы проверить сколько чисел меньше данного
//   числа делится без остатка

 /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int x = scanner.nextInt();
        if (x % 2 == 0 || x % 3 == 0 || x % 6 == 0) {
            System.out.println("Это не простое число");
        } else {
            System.out.println("Это простое число");
            System.out.println(" ");{

            }

            System.out.println("Числа, которые делятся без остатка");
    }
        for (int i = 4; i <= x; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 6 == 0) {


            System.out.println(i);
        }
}*/


    }
}