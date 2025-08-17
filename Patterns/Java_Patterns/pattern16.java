import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=rows-1;j>i;j--)
            {
                System.out.print(" ");

            }
            for(int j=rows;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<rows-1;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("  ");
            }
                for (int j =0; j<=i+1; j++) {
                    System.out.print("*");

            }
            System.out.println();
        }
    }
}