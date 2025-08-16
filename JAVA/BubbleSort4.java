import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int a=0;a<n;a++){
            arr[a]=input.nextInt();
        }
        int[] sortedArr = Sort(arr);
        System.out.println(Arrays.toString(sortedArr));

    }
    public static int[] Sort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=true;
                }
            }
            if(!flag){
              break;
            }
        }
        return arr;
    }
}
