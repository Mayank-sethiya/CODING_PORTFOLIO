import java.util.Scanner;

public class SwapTwoNumberUsingTwoVariables {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=input.nextInt();
        System.out.println("Enter the second number");
        int b=input.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swaping the numbers we have A: "+a+" and B: "+b);
    }
}
