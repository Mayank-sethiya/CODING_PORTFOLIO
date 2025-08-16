import java.util.Scanner;
//                 1
//                1 1
//               1 2 1
//              1 3 3 1
//             1 4 6 4 1

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            int number = 1;
            for (int j = 1; j <= i; j++) {

                System.out.print(number + " ");
                number=number* (i - j) / j;

            }
            System.out.println();
        }
    }
}
