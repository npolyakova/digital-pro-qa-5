public class Task5 {
    //1. Имеется фрагмент программы в виде оператора цикла с параметром,
    // обеспечивающий вывод на экран "столбиком" всех целых чисел от 10 до 30. Оформить этот фрагмент в виде:
    //    1. оператора цикла с предусловием;
    //    2. оператора цикла с постусловием.

    public static void main(String[] args) {
        for (int i = 10; i < 30; i++) {
            System.out.println(i);
        }

        int start = 10;
        do {
            System.out.println(start);
            start++;
        } while (start < 10);

        int startWhile = 10;
        while (startWhile < 10) {
            System.out.println(startWhile);
            startWhile++;
        }
    }
}
