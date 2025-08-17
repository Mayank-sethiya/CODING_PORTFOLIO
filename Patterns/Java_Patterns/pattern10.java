import java .util.Scanner;
public class pattern10
{
    public static void main(String[] args)
    {
        Scanner s2=new Scanner(System.in);
        int rows=s2.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("  ");
            }
            for(int j=2*rows-i-1;j>i;j--)
            {
            System.out.print("* ");
            }
            System.out.println();
        }
        }
    }
