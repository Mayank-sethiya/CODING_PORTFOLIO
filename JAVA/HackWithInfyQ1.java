import java.util.Scanner;

public class HackWithInfyQ1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();

        for(int i=0;i<t;i++)

        {
            int n=input.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=input.nextInt();
            }
            int j=0,max=0,itemType=arr[0];
            while(j<n)
            {
                int c=1;
                int k=j+1;
                while(k<n)
                {
                    if(arr[j]==arr[k]&&k!=j+1)
                    {
                        c+=1;
                        if(k<n-1&&arr[k]==arr[k+1])
                        {
                            k+=1;
                        }
                    }
                    k++;
                }
                if(max<c)
                {
                    max=c;
                    itemType=arr[j];
                }
                j++;

            }
            System.out.println(itemType);


        }
    }
}
