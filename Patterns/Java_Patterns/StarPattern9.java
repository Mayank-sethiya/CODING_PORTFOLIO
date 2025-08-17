import java.util.Scanner;

//                 *
//               * * *
//              * * * * *
//             * * * * * * *
//            * * * * * * * * *
public class StarPattern9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int index=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();



        }
    }
}
