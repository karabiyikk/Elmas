import java.util.Scanner;

public class elmas {
    public static void main(String[] args) {
        int n, k, j, l, m;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (m = 1; m <= n - i; m++) {
                System.out.print(" ");
            }
            for (l = 1; l <= (2 * i - 1); l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
