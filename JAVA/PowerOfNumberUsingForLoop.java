import java.util.Scanner;
public class PowerOfNumberUsingForLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int pow=input.nextInt();
        int result=1;
        for(int i=1;i<=pow;i++)
        {
            result*=num;
        }
        System.out.println(result);
    }
}
