import java.util.Scanner;

public class Task7 {
    //3. Дано натуральное число.
    //    1. Определить его максимальную цифру
    //    2. Определить его минимальную цифру

    public static void main(String[] args) {
        // 1 2 3 1 2 4
        Scanner sc = new Scanner(System.in);
        int naturalNumber = sc.nextInt();

        int min = 9; //0
        int max = 0; //4
        while (naturalNumber != 0) {
            int digit = naturalNumber % 10;
            naturalNumber = naturalNumber / 10;
            if (digit > max) {
                max = digit;
            }
            if (digit < min) {
                min = digit;
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
