import java.sql.SQLOutput;
import java.util.Scanner;

public class TotalAveragePercentGradesFiveSubjects {
    public static void main(String[] args) {
        int total=0,average=0,percentage=0;
        int grades=0;
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER FIVE SUBJECT MARKS ACCORDINGLY:");
        System.out.println("ENTER MATHEMATICS MARKS");
        int maths=input.nextInt();
        System.out.println("ENTER THE HINDI MARKS");
        int hindi=input.nextInt();
        System.out.println("ENTER THE ENGLISH MARKS");
        int english=input.nextInt();
        System.out.println("ENTER SOCIALSCIENCE MARKS");
        int socialScience=input.nextInt();
        System.out.println("ENTER THE SCIENCE MARKS");
        int  science=input.nextInt();
        total=maths+hindi+english+socialScience+science;
        System.out.println("Total of the given marks is : "+total);

        average=total/5;
        System.out.println("Average marks per grade : "+average);
        percentage=average;
        System.out.println("Percentage of grades per mark : "+percentage);
        grades=percentage/10;
        switch(grades)
        {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            default:
                System.out.println("F");
                break;
        }

        {

        }
    }
}
