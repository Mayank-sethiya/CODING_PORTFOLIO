import java.util.Scanner;

public class PalindromeStringsDigit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        String original=s,reverse="";
        for(int i=s.length()-1;i>=0;i--)
        {
           reverse += s.charAt(i);
        }
        System.out.println(original);
        System.out.println(reverse);
        if(reverse == original)
        {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }



    }
}
