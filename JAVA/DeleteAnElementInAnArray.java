import java.util.Scanner;

public class DeleteAnElementInAnArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF AN ARRAY");
        int n=input.nextInt();
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
        int[] arr=new int[n];
        int[] arrCopy=new int[n-1];
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("ENTER THE ELEMENT YOU HAVE TO DELETE OR ELIMINATE IN ARRAY");
        int ele=input.nextInt();
        int index=0;
        for(int i=0;i<n;i++)
        {



                if (arr[i] == ele) {
                    continue;
                }
                arrCopy[index++]=arr[i];



        }
        System.out.println("FINAL ARRAY AFTER ELIMINATION OF THE ELEMENT");
        for(int i=0;i<n-1;i++)
        {
            System.out.print(arrCopy[i]+" ");
        }

    }
}
