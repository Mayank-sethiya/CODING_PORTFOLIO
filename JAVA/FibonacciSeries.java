import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a=0,b=1,fib=0;
        for(int i=0;i<n;i++)
        {
            System.out.print(a+" ");
            fib=a+b;
            a=b;
            b=fib;

        }
    }
}