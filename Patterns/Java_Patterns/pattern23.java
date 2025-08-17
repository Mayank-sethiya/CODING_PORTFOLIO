import java.util.Scanner;
public class pattern23 {
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    for(int i=0;i<rows;i++)
    {
        for(int j=rows-1;j>i;j--)
        {
            System.out.print("  ");
        }
        for(int j=1;j<=2*i+1;j++)
        {
            System.out.print("1 ");

        }
        System.out.println();
    }
}
}
