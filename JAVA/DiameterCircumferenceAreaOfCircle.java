import java.util.Scanner;
public class DiameterCircumferenceAreaOfCircle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int radius=input.nextInt();
      double area=0,circumference=0,diameter=0;
        diameter=2*radius;
        circumference=2*Math.PI*radius;
        area=2*Math.PI*Math.pow(radius,2);
        System.out.println("The area of the circle is "+area);
        System.out.println("The circumference of the circle is "+circumference);
        System.out.println("The diameter of the circle is "+diameter);
    }
}
