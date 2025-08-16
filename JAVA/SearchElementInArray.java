import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("ENTER THE ELEMENT YOU HAVE TO SEARCH IN ARRAY");
        int element = input.nextInt();
        System.out.println(search(arr, element));
    }
    public static String search(int[] arr,int element)
        {
       for(int i=0;i<arr.length;i++)
       {
           if(element == arr[i])
           {
              return"THE ELEMENT YOU ARE SEARCHIONG IS PRESENTB AT INDEX:"+i;
           }


       }
            return("NOT PRESENT IN ARRAY");
    }
}


