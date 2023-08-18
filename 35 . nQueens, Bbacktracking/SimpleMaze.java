import java.util.ArrayList;

class SimpleMaze{
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println();
        // maze(arr, 0, 0);simple maze that count the ways
        mazePath(arr, 0, 0, "");//print the paths 
        System.out.println(mazePathArrayList(arr, 0, 0, ""));
    }

    static int maze(int[][]arr, int i, int j ){
        int ans = 0;

        if(i == arr[0].length-1 && j == arr.length -1){

            System.out.println("Path found : " );
            return 1;
        }
        else if(i == arr[0].length-1){
            ans += maze(arr, i, j+=1);
            
            return ans;
        }
        else if(j == arr.length-1){
            ans += maze(arr, i += 1, j);
  
            return ans;
        }
        else{
            ans =ans + maze(arr, i+1, j);
            ans  =ans + maze(arr, i, j+1);

            System.out.println("right :"+ans);
            return ans;
        }
        
        
    }

   // Simple Processed and Unprocessed Method
    static void mazePath(int[][]arr, int i, int j, String p ){

        if(i == arr[0].length-1 && j == arr.length-1){
            System.out.println(p);
            return;
        }

        if(i == arr[0].length-1){
            char ch = 'R';
            mazePath(arr, i, j+1, p+ch);
        }
        else if(j == arr.length-1){
            char ch = 'D';
            mazePath(arr, i+1, j, p+ch);
        }
        
        else{
            char ch = 'D';
            mazePath(arr, i+1, j, p+ch);
            char ch2 = 'R';
            mazePath(arr, i, j+1, p+ch2);
        }
        
    }
   // Simple Processed and Unprocessed Method
    static ArrayList<String> mazePathArrayList(int[][]arr, int i, int j, String p ){

        ArrayList<String> outerlist = new ArrayList<>();
        if(i == arr[0].length-1 && j == arr.length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if(i == arr[0].length-1){
            // char ch = 'R';
            outerlist.addAll(mazePathArrayList(arr, i, j+1, p+'R'));
        }
        else if(j == arr.length-1){
    
            outerlist.addAll(mazePathArrayList(arr, i+1, j, p+'D'));
        }
        
        else{

            //Down
            outerlist.addAll(mazePathArrayList(arr, i+1, j, p+'D'));
            //Diogonal
            outerlist.addAll(mazePathArrayList(arr, i+1, j+1, p+'C'));
            //Right
            outerlist.addAll(mazePathArrayList(arr, i, j+1, p+'R'));   
        }
        return outerlist;
        
    }
}