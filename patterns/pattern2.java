import java.util.Scanner;

public class pattern2{
    public static void main(String[] args) {
        int i, j;
        boolean val;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            val = (i % 2 != 0);

            for (j = 1; j <= i; j++) {
                System.out.print(val ?  1 : 0);
                val = !val;
            }
            System.out.println();
        }
    }
}
