import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt(),lastdigit=0,reverse=0;
        int original=n;
        while(n!=0)
        {
            lastdigit=n%10;
            reverse=(reverse*10)+lastdigit;
            n/=10;

        }

        System.out.println(original);
        System.out.println(reverse);
        if(reverse==original)
        {
            System.out.println("IT IS A PALINDROME NUMBER");
        }
        else {
            System.out.println("NOT A PALINDROME NUMBER");
        }


    }
}
