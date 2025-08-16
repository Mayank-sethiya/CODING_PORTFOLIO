import java.util.Scanner;

public class SwapTwoNumbersUsingThreeVariables {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int a=input.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int b=input.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After swaping the numbers we have A: "+a+" and B: "+b);
    }
}
