import java.util.Scanner;
public class pattern32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j % 2 == 0) {
                    System.out.print(count + " ");
                } else {

                    System.out.print("* ");
                }

            }
            count++;
            System.out.println();


        }

    }
}

