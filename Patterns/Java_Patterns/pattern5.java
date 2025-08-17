import java.util.Scanner;
public class pattern5
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        int rows=s1.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=rows;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}