import java.util.Scanner;
//              *
//             * *
//            * * *
//           * * * *
//          * * * * *
//           * * * *
//            * * *
//             * *
//              *

public class StarPattern14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }

            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(" ");
            }
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
