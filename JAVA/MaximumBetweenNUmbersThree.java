import java.util.Scanner;

public class MaximumBetweenNUmbersThree {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        System.out.println(num1>num2&&num1>num3?num1:num3>num1?num3:num2);
    }
}
