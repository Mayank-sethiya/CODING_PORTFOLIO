import java.util.Scanner;

public class PalindromeWithoutEquals {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        System.out.println(isPalindrome(s));
    }
     static String isPalindrome(String ss)
    {
        int start=0;
        int end=ss.length()-1;
        while(start<end)
        {
        if(ss.charAt(start)!= ss.charAt(end))
            {
                return "NOT A PALINDROME";
            }
        start++;
        end--;
        }
        return "PALINDROME";
    }
}
