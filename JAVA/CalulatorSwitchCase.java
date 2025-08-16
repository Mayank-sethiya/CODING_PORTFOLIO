import java.util.Scanner;

public class CalulatorSwitchCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF A:" );
        long a=input.nextLong();
        System.out.println("ENTER THE VALUE OF B:" );
        long b=input.nextLong();
        System.out.println("ENTER THE OPERATION YPU JAVE TO PERFORM +,-,*,/,%");
        char operation=input.next().charAt(0);
        System.out.println(calc(a,b,operation));

    }
    public static long calc(long x,long y,char operation)
    {
        switch(operation)
        {
            case '+': {
                return x + y;

            }
            case '-': {


                return x - y;

            }
            case  '*': {
                return x * y;
            }
            case '/': {
                return x / y;

            }
            case '%': {
                return x % y;

            }
            default: {
                System.out.println("Enter a valid operation");
            }
        }
    return -1;
    }
}
