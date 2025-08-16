import java.util.Scanner;

public class InsertAnElementAtSoecifiedPosition {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER THE ELEMENT YOU WANT TO CHANGE");
        int element=input.nextInt();
        System.out.println("ENTER THE POSITION OF THE ELEMENT");
        int index=input.nextInt();
        if(index>arr.length)
        {
            System.out.println("INVALID INDEX");
        }
        arr[index-1]=element;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
