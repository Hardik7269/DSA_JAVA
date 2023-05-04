import java.util.Arrays;

class Searching{
    public static void main(String[] args) {
        int [][] arr = {{10,20,30,40},
                        {15,25,36,50},
                        {60,70,80,90}};
        System.out.println(Arrays.toString(searchMatrix(arr, 50)));
    }

    public static int[] searchMatrix(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;
        if(row == 1){
            binarySearch2d(matrix, row, 0, col-1, target);
        }
        //run the loop till 2 rows are remaining
        int sRow = 0;
        int eRow = matrix.length-1;
        int mCol = col/2;

        while(sRow < eRow-1 ){//after this itll haveing only two rows
            int mid  = sRow + (eRow - sRow)/2;

            if(matrix[mid][mCol] > target){
                eRow = mid-1;
            }else if(matrix[mid][mCol] < target){
                sRow = mid;
            }else{//it will check the mid row element in mid col ..
                return new int[] {mid, mCol};
            }
            
        }
        //now we have two rows
        if(matrix[sRow][mCol] == target){
            return new int[] {sRow,mCol};
        }
        if(matrix[sRow+1][mCol] == target){
            return new int[] {sRow+1,mCol};
        }

        // other wise search in 1st half 
        if(target <= matrix[sRow][mCol-1] ){
            return binarySearch2d(matrix, sRow, 0, mCol-1, target);
        }
        //2nd half
        if(target <= matrix[sRow][mCol+1] && target <= matrix[sRow][col-1]){
            return binarySearch2d(matrix, sRow, mCol+1, col-1, target);
        }
        //3rd half
        if(target <= matrix[sRow+1][mCol-1] ){
            return binarySearch2d(matrix, sRow+1, 0, mCol-1  , target);
        }//4th half
        else{ 
            return binarySearch2d(matrix, sRow+1,  mCol+1, col-1  , target);
        }
        
    }

    static int[] binarySearch2d(int[][] arr, int row, int sCol, int eCol, int target){

        while(sCol <= eCol){
            int mid = sCol + (eCol - sCol)/2;

            if(arr[row][mid] > target){
                eCol = mid - 1;
            }else if(arr[row][mid] < target){
                sCol = mid+1;
            }else{
                return new int[] {row,mid};
            }
        }
        return new int[] {-1,-1};
    }
}