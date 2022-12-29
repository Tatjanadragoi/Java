package lesson11;






//5) Для введённого пользователем с клавиатуры натурального числа
// посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).


import java.util.Random;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {


        //1) Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98


/*for (int i = 7; i <= 98; i+=7) {

            System.out.println(i);

        }*/


//3) Необходимо суммировать все нечётные целые числа в диапазоне,
// который введёт пользователь с клавиатуры.  Например от 10 до 100


        //Не получается суммировать числа :((

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = scanner.nextInt();
        System.out.println("Введите второе число");
        int y = scanner.nextInt();
        int summ= 0;
        for (int i = x; i <= y; i++) {


            if (i % 2 == 1) {

                System.out.println(i);

            }

    }*/


        //4)Создать программу, выводящую на экран случайно сгенерированное
// трёхзначное натуральное число и его наибольшую цифру.


       /* Random random = new Random();
        int number = random.nextInt(100, 999);
        System.out.println(number);
        int a = number / 100;
        int b = (number / 10) % 10;
        int c = number % 10;
        if (a > b && a > c) {
            System.out.println("Самая большая цифра в числе " + number + " является " + a);

        } else if (b > a && b > c) {
            System.out.println("Самая большая цифра в числе " + number + " является "+ b);
        } else {
            System.out.println("Самая большая цифра в числе " + number + " является "+ c);
        }*/






        //2) Организовать беспрерывный ввод чисел с клавиатуры, пока пользователь
    // не введёт 0. После ввода нуля, показать на экран количество чисел,
    // которые были введены, их общую сумму и среднее арифметическое.
    // Подсказка: необходимо объявить переменную-счетчик, которая будет
    // считать количество введенных чисел, и переменную, которая будет накапливать общую сумму чисел.


                Scanner scanner = new Scanner(System.in);
                int i;
                int summ = 0;
                int c = 0;
                do {
                    i = scanner.nextInt();
                    summ += i;
                    c++;
                } while (i != 0);
                System.out.println(summ + " - Общая сумма чисел");
        System.out.println(c + " - Количество введенных чисел");
                System.out.println(summ /c + " - Среднее арифметическое");
            }
        }

