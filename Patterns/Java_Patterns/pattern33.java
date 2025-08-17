import java.util.Scanner;
public class pattern33{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int i,j;
        int count;
        for(i=1;i<=rows;i++)
        {
            for( j=rows-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            count=0;
            for(j=1;j<rows;j++){
                if(count<i-1){
                    if(!(j<rows-i+1)){
                        System.out.print(j);
                        count++;
                    }
                }
            }
            System.out.print("0");
            count=0;
            for(--j;j>=1;j--){// this loop is used to print j and increment count
                if(count<i-1){
                    System.out.print(j);
                    count++;
                }
            }
            System.out.println("");
        }
    }
}