import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int size1=input.nextInt();
        int[] arr1=new int[size1];
        System.out.println("Enter the elements of the first array");
        for(int i=0;i<size1;i++){
            arr1[i]=input.nextInt();
        }
        System.out.println("Enter the size of the second array");
        int size2=input.nextInt();
        int[] arr2=new int[size2];
        System.out.println("Enter the elements of the second array");
        for(int i=0;i<size2;i++){
            arr2[i]=input.nextInt();
        }
        int m=arr1.length;
        int n=arr2.length;
        int i=0,j=0,index=0;
        int[] merge=new int[m+n];
        while(i<m && j<n)
        {
            if(arr1[i]<arr2[j])
            {
                merge[index++]=arr1[i++];
            }
            else
            {
                merge[index++]=arr2[j++];
            }
        }
        while(i<m)
        {
            merge[index++]=arr1[i++];
        }
        while(j<n)
        {
            merge[index++]=arr2[j++];
        }
        for(i=0;i<merge.length;i++)
        {
            System.out.print(merge[i]+" ");
        }

    }

}
