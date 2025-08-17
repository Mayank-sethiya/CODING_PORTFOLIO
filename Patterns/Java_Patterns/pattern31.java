import java.util.Scanner;
public class pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            int count = rows;
            for (int j = 0; j < rows; j++) {
                if (j == rows - i-1) {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(count + " ");
                    count--;
                }
            }
            System.out.println();
        }
    }
}
