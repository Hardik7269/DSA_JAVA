public class BlockedWay {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];
        blockedCube(arr, "", 1, 1);
    }
    static void blockedCube(int[][] arr, String p, int i, int j){
        if(i == arr[0].length && j == arr.length){
            System.out.println(p);
            return;
        }

        if((i==3 && j==2) || (i==4 && j==3)){
            p = "";
            return;
        }
        else{
            if(i==arr[0].length){
                blockedCube(arr, p+'R', i, j+1); 
            }
            else if(j==arr.length){
                blockedCube(arr, p+'D', i+1, j); 
            }
            else{
                blockedCube(arr, p+'R', i, j+1);
                // blockedCube(arr, p+'C', i+1, j+1);
                blockedCube(arr, p+'D', i+1, j);
            }
            
        }

        
        
    }
}
