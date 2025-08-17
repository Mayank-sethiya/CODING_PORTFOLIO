import java.util.Scanner;
//              * * * * *
//             * * * *
//           * * *
//          * *
//         *
//          * *
//           * * *
//            * * * *
//             * * * * *

public class StarPattern16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print(" ");
            }
            for(int j = n; j >= i; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++)
        {
          for(int j=1;j<=i+1;j++)
          {
              System.out.print(" ");
          }
            for(int j=1;j<=i+1;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
