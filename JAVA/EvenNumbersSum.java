import java.util.Scanner;

public class EvenNumbersSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of numbers you want to enter");
        int n=input.nextInt();
        int sum=0;
        System.out.println("the even numbers are:");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("THE SUM IS "+sum);
    }
}
