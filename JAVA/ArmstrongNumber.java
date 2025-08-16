    import java.util.Scanner;

    public class ArmstrongNumber {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            for (int k = 1; k <= n; k++) {
                int num=k, oringinalNum = k, OriginalNum2 = k, count = 0, sum = 0, ArmstrongNumber = 0;
                while (num > 0) {
                    count++;
                    num/= 10;
                }
                while (OriginalNum2 > 0) {
                    ArmstrongNumber += Math.pow(OriginalNum2 % 10, count);
                    OriginalNum2 /= 10;
                }
                if (ArmstrongNumber == oringinalNum) {
                    System.out.println(k);
                }
            }
        }
    }
