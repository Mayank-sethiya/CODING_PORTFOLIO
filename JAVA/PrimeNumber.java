import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        for(int i=2;i<=n;i++) {
            int count=0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    count++;
                }

            }

            if (count == 2) {
                System.out.print(i+" ");
            }
        }
    }
}
