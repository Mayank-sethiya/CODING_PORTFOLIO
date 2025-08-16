import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0,sub=0,div=0,mul=0,rem=0;
        int a = input.nextInt();
        int b = input.nextInt();
        sum=a+b;
        sub=a-b;
        div=a/b;
        mul=a*b;
        rem=a%b;
        System.out.println("THE SUM OF THE GIVEN NUMBERS IS"+sum);
        System.out.println("THE SUBTRACTION OF TWO NUMBERS IS"+sub);
        System.out.println("THE MULTIPLICATION OF TWO NUMBERS IS"+mul);
        System.out.println("THE DIVISION OF TWO NUMBERS IS"+div);
        System.out.println("THE REMAINDER OF TWO NUMBERS IS"+rem);
    }
}
