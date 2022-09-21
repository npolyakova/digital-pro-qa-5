import java.util.Scanner;

public class Task4 {
    //4. Даны натуральное число n и вещественные числа a1, a2, ..., an.
    //Определить среднее арифметическое вещественных чисел

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n ");
        int n = sc.nextInt();

        double sum = 0;
        for(int i = 1; i <= n; i++) {
            System.out.println("Введите число ");
            double number = sc.nextDouble();
            sum += number;
        }

        System.out.println("Среднее арифметическое " + sum/n);
    }
}
