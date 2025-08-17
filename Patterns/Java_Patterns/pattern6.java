import java.util.Scanner;
public class pattern6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=0;i< rows;i++) {
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("   ");
            }
            for (int j = rows; j > i; j--) {
                System.out.print("*  ");
            }
            System.out.println();
        }

    }
}