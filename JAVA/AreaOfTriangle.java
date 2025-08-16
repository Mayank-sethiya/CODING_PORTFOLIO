import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE BASE");
        int base = input.nextInt();
        System.out.println("ENTER THE HEIGHT");
        int height = input.nextInt();
        double area= (.5) * (base * height);
        System.out.println("The area of the triangle is "+area);
    }
}
