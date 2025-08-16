import java.util.Scanner;

public class MaxMinInArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int size=input.nextInt();
        System.out.println("Enter the elements in the array");
        int arr[]=new int[size];
        for(int a=0;a<size;a++)
        {
            arr[a]=input.nextInt();
        }
        int min=arr[0],max=arr[0];
        for(int i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("MAXIMUM ELEMENT IN THE ARRAY IS: "+max);
        System.out.println("MINIMUM ELEMENT IN THE ARRAY IS: "+min);
    }
}
