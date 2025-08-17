import java.util.Scanner;
public class pattern11{
    public static void main(String[] args)

    {
        Scanner s3=new Scanner(System.in);
        int rows=s3.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=rows-1;j>i;j--)
            {
                System.out.print("  ");
            }
            for(int j=0;j<=2*i+1;j++)
            {
                if(j%2!=0)
                {
                    System.out.print("*");

                }
                else {
                    if (j==0)
                    {
                        System.out.print("");
                    }
                    else
                    {
                        System.out.print("   ");
                    }
                }
                }

            System.out.println();
            }

        }
    }
