public class RangePrime {
    public static void main(String[] args) {
        int a=5,count=0;
        int b=20;
        for(int i=a;i<=b;i++)
        {
            count=0;
            for(int j=1;j<=a;j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.print(i+" ");
            }
        }
    }
}
