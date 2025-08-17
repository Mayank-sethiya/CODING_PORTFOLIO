import java.util.Scanner;
//               *
//              *  *
//            *  *  *
//           *  *  *  *
//          *  *  *  *  *

public class StarSpacePattern11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for (int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                if(j%2==0)
                {
                    System.out.print("  ");
                }
                else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }

    }
}
