import java.util.Scanner;
public class CheckPositiveNegativeUsingSwitchCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        switch((int)Math.signum(num))
        {
            case 1:
                System.out.println("POSITIVE NUMBER");
                break;
            case -1:
                System.out.println("NEGATIVE NUMBER");
                break;
            case 0 :
                System.out.println("Zero");
                break;
        }

    }
}
