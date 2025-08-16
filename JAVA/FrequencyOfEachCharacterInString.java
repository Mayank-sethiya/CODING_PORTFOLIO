import java.util.Scanner;

public class FrequencyOfEachCharacterInString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();

        boolean[] visited=new boolean[str.length()];
        for(int i = 0; i < str.length(); i++){
            if(visited[i]){
                continue;
            }
            int count=0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    visited[j]=true;
                }

            }
            System.out.println("the frequency of the character: " +str.charAt(i)+" "+count );
        }
    }
}
