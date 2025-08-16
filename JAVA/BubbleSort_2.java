import java.util.Scanner;

public class BubbleSort_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=input.nextInt();
        int[] arr=new int[n];
        int index=0;
        for(int nums:arr)
        {
            arr[index++]=input.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
