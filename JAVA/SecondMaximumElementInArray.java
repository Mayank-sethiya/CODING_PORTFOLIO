import java.util.Scanner;
import java.util.Arrays;
public class SecondMaximumElementInArray {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("MAXIMUM ELEMENT IS: "+max);
        Arrays.sort(arr);
        for(int i=n-1;i>0;i--)
        {
        if(arr[i]<max)
        {
            System.out.println("THE SECOND LARGEST NUMBER IN THE ARRAY IS : "+arr[i]);
            break;
        }
        }
    }
}
