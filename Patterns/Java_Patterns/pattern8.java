import java.util.Scanner;
public class pattern8
{
    public static void main(String[] args)
    {
        Scanner s1=new Scanner(System.in);
        int rows=s1.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<rows;j++)
            {
                if(i==j||j==rows-i-1)
                {
                    System.out.print("*  ");

                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
