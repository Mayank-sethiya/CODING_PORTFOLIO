import java.util.Scanner;

public class HackWithInfyQ2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t-->0)
        {
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            int x=input.nextInt();
            int y=input.nextInt();
            if((a+b+c)!=(x+y))
            {
                System.out.println("NO");
            }
            if(x<Math.min(a,Math.min(b,c))||y<Math.min(a,Math.min(b,c)))
            {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
