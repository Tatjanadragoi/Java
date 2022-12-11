package lesson7;

//1) Введите с консоли два числа и выведите больше ли второе число чем   первое
//2) Создайте метод, который принимает 2 числа и возвращает больше или равно первое число по
// сравнению со вторым
//3) создайте метод который будет принимать 2 строки и писать возвращать строку, которая
// составляется склеиванем первой половины первого слова и второй половины второго слова
//Например
//Вход : "привет" и "цветок". на выходе будет "приток". (при - первая половина от
// первого слова, ток - вторая половина от второго слова)

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
      //  System.out.println("Веедите первое число");
      //  int x = scanner.nextInt();
      //  System.out.println("Введите второе число");
     //   int y = scanner.nextInt();
     //   boolean result = y > x;
     //   System.out.println(result);
      //  boolean res = result (6,7);
      //  System.out.println(res);
        System.out.println(pritok("privet", "cvetok"));
    }

    public static boolean result(int first, int second) {
        return first >= second;
    }
    public static String pritok (String x, String y) {
       String one = x.substring(0, 3);
        String two = y.substring(3, 6);
        return one + two;


    }
}


