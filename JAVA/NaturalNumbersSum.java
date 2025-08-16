import java.util.Scanner;
public class NaturalNumbersSum {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int num=input.nextInt(),sum=0;
         for(int i=1;i<=num;i++)
         {
             System.out.println(i);
             sum+=i;
         }
        System.out.println("The sum is"+" "+ sum);
    }
}
