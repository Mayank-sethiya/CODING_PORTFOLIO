import java.util.Scanner;

public class InsertionSort4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={5,2,8,7,89,56,4};
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 &&arr[j]>arr[key])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

    }
}

