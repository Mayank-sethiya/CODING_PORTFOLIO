import java.util.Scanner;

public class HcfGcd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int gcd=0;
        int min=num1<num2?num1:num2;
        for (int i=1;i<min;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
               gcd=i;
            }
        }
        System.out.println(gcd+" ");
        int lcm=num1*num2/gcd;
        System.out.println(lcm+" ");
    }
}
