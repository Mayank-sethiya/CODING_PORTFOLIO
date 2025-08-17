import java.util.Scanner;
public class pattern30 {
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();

    for(int i=0;i<rows;i++)
    {
        int count=rows;
        for(int j=0;j<rows;j++)
        {
            System.out.print(count+" ");
            count--;
        }
        System.out.println();
    }
}
}
