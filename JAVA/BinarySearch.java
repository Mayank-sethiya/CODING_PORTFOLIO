import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter an sorted array");
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int target=input.nextInt();
        int start=0,end=n-1;

        while(start<=end)

        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                System.out.println((mid));
                break;
            }
            else if(arr[mid]<target) {
                start=mid+1;

        }
            else {
                end=mid-1;
        }

        }
    }
}
