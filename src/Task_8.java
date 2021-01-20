public class Task_8 {
    public static void main(String[] args) {

        int n = 4;
        int c = n;

        for (int i=0; i<n; i++) {
            for (int g=0; g<c; g++) {
                System.out.print("* ");
            }
            c--;
            System.out.println();
        }
    }
}
