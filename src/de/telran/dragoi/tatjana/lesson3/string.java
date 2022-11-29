package de.telran.dragoi.tatjana.lesson3;

public class string {
    public static void main(String[] args) {
        String str = "test"; // 0 =t, 1= e, 2=s, 3= t
        System.out.println(str);
        System.out.println(str.length());
        System.out.println("WOW!" +str);
        System.out.println(str.charAt(1));
        System.out.println(0);
        System.out.println(str.lastIndexOf("t"));
        System.out.println(str.indexOf("st"));
        System.out.println(str.substring(2));
        System.out.println(str.substring(1,3));
        System.out.println(str.toUpperCase());
        System.out.println(str.replace("t", "v"));
        String sumRes = str + "tt";
    }
}
