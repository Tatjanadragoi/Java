package de.telran.dragoi.tatjana.lesson3;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        String str = "I love Java Lessons!";
        System.out.println(str.charAt(0));
        System.out.println(str.contains("love"));
        System.out.println(str.replace("o","a"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.substring(12,19)); // если без восклицательного знака
        System.out.println(str.indexOf("L"));
  Scanner scan = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
  String name = scan.nextLine();
        System.out.println("Hello," + name +"!" );

        System.out.println("Ваше имя начинается с буквы" + " " + (name.charAt(0)) );







    }
}
