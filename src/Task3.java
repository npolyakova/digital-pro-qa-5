import java.util.Scanner;

public class Task3 {

    //3. Найти:
    //    1. сумму всех целых чисел от 100 до 500;
    //    2. сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b>=a).

    public static void main(String[] args) {
        //    1. сумму всех целых чисел от 100 до 500;
        int sum = 0;
        for (int i = 100; i < 500; i++) {
            sum += i; //sum = sum + i
        }
        System.out.println(sum);

        //    2. сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b>=a).
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа a, b, где b>=a");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b >= a) {
            int sum1 = 0;
            for (int i = a; i < b; i++) {
                sum1 += i; //sum = sum + i
            }
            System.out.println(sum1);
        } else {
            System.out.println("b < a, введите другие числа");
        }
    }
}
