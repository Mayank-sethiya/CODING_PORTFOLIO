import java.util.Scanner;
public class pattern9
{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int rows = s1.nextInt();
    for (int i=0;i<rows;i++)
    {
        for(int j=rows-1;j>i;j--)
        {
            System.out.print("   ");
        }
        for(int j=1;j<=2*i+1;j++)
        {
            System.out.print("*  ");

        }
        System.out.println();
    }
    }
}