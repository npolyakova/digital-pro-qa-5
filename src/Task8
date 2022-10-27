public class Task8 {

    //Дано натуральное число. Определить:
    //количество цифр 3 в нем;
    //сколько раз в нем встречается последняя цифра;
    //количество четных цифр в нем;
    //сумму его цифр, больших пяти;
    //произведение его цифр, больших семи;
    //сколько раз в нем встречаются цифры 0 и 5 (всего).

    public static void main(String[] args) {

        int naturalNumber = 2032934583;
        int threeCount = 0;
        int lastDigit = naturalNumber % 10;
        int lastDigitCount = 0;
        int evenDigitsCount = 0;
        int sum = 0;
        int product = 1;
        int nullsAndFiveCount = 0;

        while (naturalNumber > 0) {
            int digit = naturalNumber % 10;

            if (digit == 3) {
                threeCount++;
            }

            if (digit == lastDigit) {
                lastDigitCount++;
            }

            if (digit % 2 == 0) {
                evenDigitsCount++;
            }

            if (digit > 5) {
                sum += digit;
            }

            if (digit > 7) {
                product *= digit;
            }

            if (digit == 0 || digit == 5) {
                nullsAndFiveCount++;
            }

            naturalNumber /= 10;
        }

        if (product == 1) {
            product = 0;
        }

        System.out.println("Количество цифр 3 " + threeCount);
        System.out.println("Сколько раз встречается последняя цифра " + lastDigitCount);
        System.out.println("Количество четных цифр " + evenDigitsCount);
        System.out.println("Сумма цифр, больших пяти " + sum);
        System.out.println("Произведение цифр, больших семи " + product);
        System.out.println("Сколько раз встречаются цифры 0 и 5 " + nullsAndFiveCount);
    }
}
