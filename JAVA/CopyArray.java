import java.sql.SQLOutput;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] arrCopy=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arrCopy[i]=arr[i];
        }
        int[] reverse=new int[arr.length];
        int j=arr.length-1;
        for(int i=0;i<arrCopy.length;i++)
        {
           reverse[i]=arr[j];
           j--;
        }
        System.out.println(("THE COPY OF ARRAY PROVIDED IS:"));
        for(int i=0;i<arrCopy.length;i++)
        {
            System.out.print(arrCopy[i]+"\n");
        }
        System.out.println("THE REVERSE ARRAY IS:");
        for (int i=0;i<reverse.length;i++)
        {
            System.out.print(reverse[i]+"\n");
        }
    }
}
