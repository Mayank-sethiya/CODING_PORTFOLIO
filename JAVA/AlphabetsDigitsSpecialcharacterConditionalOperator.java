import java.sql.SQLOutput;
import java.util.Scanner;
public class AlphabetsDigitsSpecialcharacterConditionalOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        char n=input.next().charAt(0);
        System.out.println((Character.isDigit(n))? "IT IS A DIGIT" : (Character.isLetter(n))? "IT IS AN ALPHABET" : "IT IS AN SPECIAL CHARACTER");


    }
}
