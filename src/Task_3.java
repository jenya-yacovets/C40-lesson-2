public class Task_3 {
    public static void main(String[] args) {

        int x = 10;
        int sum = 0;

        do {
            if (x % 2 == 0) {
                sum += x;
            }
            x++;
        } while (x <= 50);

        System.out.println(sum);
    }
}
