public class Task_6 {
    public static void main(String[] args) {

        int years = 450;
        int heads = 0;

        for (int i=1; i<=years; i++) {
            if (i <= 300) {
                heads += 2;
            } else {
                heads++;
            }
        }

        System.out.println("У дракона " + heads + " голова");
    }
}