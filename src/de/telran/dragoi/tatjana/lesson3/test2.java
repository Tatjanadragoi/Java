package de.telran.dragoi.tatjana.lesson3;

import java.util.Locale;

public class test2 {
    public static void main(String[] args) {
        String str = "I study Basic Java";
        System.out.println(str.charAt(17));
        System.out.println(str.contains("Java"));
        System.out.println(str.replace("a", "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.substring(str.indexOf("Java")));
        System.out.println(str.indexOf("d"));





    }
}
