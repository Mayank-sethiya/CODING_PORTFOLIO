import java.util.Scanner;

//        * * * * * * *
//        * * *   * * *
//        * *       * *
//        *           *
//        * *       * *
//        * * *   * * *
//        * * * * * * *

public class StarPattern19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // Upper part of the pattern
        for (int i = 1; i <= n; i++) {
            // Print stars on the left side
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }

            // Print spaces in the middle
            for (int j = 1; j < 2 * i - 1; j++) {
                System.out.print("  ");
            }

            // Print stars on the right side
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            // Print stars on the left side
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }

            // Print spaces in the middle
            for (int j = 1; j < 2 * i - 1; j++) {
                System.out.print("  ");
            }

            // Print stars on the right side
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
