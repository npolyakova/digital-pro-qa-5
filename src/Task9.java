public class Task12 {

    public static void main(String[] args) {
        double sum = 1000;
        double percent = 0.02;
        int count = 0;

        while(sum*percent < 30) {
            sum += sum*percent;
            count++;
        }

        System.out.println(sum*percent + " " + count);


        sum = 1000;
        count = 0;
        do {
            sum += sum*percent;
            count++;
        } while (sum<1200);

        System.out.println(sum+" "+count);
    }
}
