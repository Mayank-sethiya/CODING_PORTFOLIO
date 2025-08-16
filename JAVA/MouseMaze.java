import java.util.*;

class MouseMaze {

    static class Choice{

        String dname;

        int dx, dy;



        Choice(String dname, int dx, int dy){

            this.dname = dname;

            this.dx = dx;

            this.dy = dy;

        }

    }



    public static List<String> ratMaze(int arr[][], int n){

        List<String> res = new ArrayList<>();

        StringBuilder path = new StringBuilder();



        List<Choice> choices = Arrays.asList(

                new Choice("U",-1,0),

                new Choice("D", 1,0),

                new Choice("L", 0, -1),

                new Choice("R", 0, 1)

        );

        if(arr[0][0]==1)

            helper(0, 0, n, arr, choices, res, path);

        return res;

    }



    public static boolean isSolved(int x, int y, int n){

        if(x==n-1 && y==n-1)

            return true;

        return false;

    }



    public static boolean isValid(int x, int y, int n, int arr[][]){

        return x>=0 && x<=n-1 && y>=0 && y<=n-1 && arr[x][y]==1;

    }



    public static void helper(int x, int y, int n, int arr[][], List<Choice> choices, List<String> res, StringBuilder path){

        if(isSolved(x, y, n)){

            res.add(path.toString());

            return;

        }

        for(Choice c : choices){

            int newX = x + c.dx;

            int newY = y + c.dy;



            if(isValid(newX, newY, n, arr)){

                path.append(c.dname);

                arr[x][y] = 0;



                helper(newX, newY, n, arr, choices, res, path);



                arr[x][y] = 1;

                path.deleteCharAt(path.length()-1);

            }

        }



    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        for(int i=0; i<n; i++){

            for(int j=0; j<n; j++){

                arr[i][j] = sc.nextInt();

            }

        }

        List<String> paths = ratMaze(arr, n);

        for(String ele : paths){

            System.out.println(ele);

        }

    }

}