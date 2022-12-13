package lesson8;

//написать метод который будет возвращать ответ на вопрос
// делится ли число на 3 и НЕ делится на 5. num% 3 == 0

public class test {
    public static void main(String[] args) {
        System.out.println(result(9));
    }
    public static boolean result (int num) {
        return (num % 3 == 0) && (num % 5 != 0);

    }
}
