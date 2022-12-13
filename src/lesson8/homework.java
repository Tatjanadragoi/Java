package lesson8;

import java.util.Random;
import java.util.Scanner;

public class homework {
        public static void main(String[] args) {
                //С консоли вводится число - возраст человека
                //после чего вызывается метод, который возвращает ответ можно ли этому человеку
                // смотреть фильм, у фильма ограничение по возрасту не меньше 18.




        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите ваш возвраст");
        int x = scanner.nextInt();
       if (x < 18) {
            System.out.println("Рановато вам еще :)");
        }
       else {
           System.out.println("Добро пожаловать в кино");
       }*/


                //  2)  напишите программу, которая принимает 1 число - год (можно с помощью Scanner
                //  или с помощью Random) и выводит високосный год или нет

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год НЕ високосный");
        }*/


                //Покупатель приходит в магазин печенья, 1 печенье стоит 0.5 евро
                //Напишите программу которая спрашивает у покупатель сколько он хочет
                // купить печенья, после этого с помощью Scanner считывается число сколько
                // печенья хочет купить покупатель, после спрашивается сколько денег у покупателя
                // и считывается число (сколько денег у покупателя), программа должна написать
                // может ли купить столько печенья за такие деньги, например
                //покупатель хочет купить 10 печенек, у него 4 евро ответ  нельзя
                //покупатель хочет купить 12 печенек, у него 8 евро ответ  можно

        /*double cookiePrice = 0.5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько пиченюшек желаете?");
        int amountOfCookie = scanner.nextInt();
        System.out.println("А сколько денег у вас?");
        int money = scanner.nextInt();
        if (amountOfCookie * cookiePrice <= money) {
            System.out.println("Берите пожалуйста");
        } else {
            System.out.println("Маловато денег у вас");
        }*/


                //напишите программу, которая говорит выпал орел или решка
                //true - орел
                //false -решка
                //используйте Random и метод nextBoolean,


                // P.S не могу понять, почему не получается так :(

      /*  Random random = new Random();
        boolean x = random.nextBoolean();
        if ( x = true) {
            System.out.println("Орел");
        } else  {
            System.out.println("Решка");
        }*/


// стране А ездят машины с номерами от 1 до 10000, в городе Б большая
// проблема с парковками по выходным, чтобы уменьшить количество пробок,
// власти решили пускать в город по выходным только легковые машины с четными
// номерами, напишите программу, которая принимает на вход два параметра:
// номер машины и isLorry (грузовая машина или нет), в результате программа
// выводит можно заезжать машине или нет в город



                //P.S Никак не получается ввести второе условие :(


                Scanner scanner = new Scanner(System.in);
                System.out.println("number of your car");
                int number = scanner.nextInt();
               // System.out.println("If it's Lorry, write y, if not - n");
               // String lorry = scanner.next();
               if (number % 2 == 0) {
                       System.out.println("Проезжайте");
               } else {
                       System.out.println("Сегодня нельзя");
               }


        }
}

