import java.util.*;
class SpiralMatrix2{
    public static void main(String[] args) {
        int n = 3;
        int rowBegin = 0;
        int colBegin = 0;
        int rowEnd = n -1 ;
        int colEnd = n -1;
        int [][] arr = new int [n][n];
        int c = 1 ;
        while(rowBegin <= rowEnd && colBegin <= colEnd){
            for(int i = colBegin  ; i <= colEnd ; i++){
                arr[rowBegin][i] = c;
                c++;
            }rowBegin++;
    
            for(int i = rowBegin ; i <= rowEnd ; i++){
                arr[i][colEnd] = c;
                c++;
            }colEnd--;
    
            if(colBegin <= colEnd){
                for(int i = colEnd ; i >= colBegin ; i--){
                    arr[rowEnd][i] = c;
                    c++;
                }
            }rowEnd--;
    
            if(rowBegin <= rowEnd){
                for(int i = rowEnd ; i >= rowBegin ; i--){
                    arr[i][colBegin] = c;
                    c++;
                }
            }colBegin++;

        }

        //printing matrix

        System.out.println(Arrays.toString(arr[0]));       
        System.out.println(Arrays.toString(arr[1]));       
        System.out.println(Arrays.toString(arr[2]));       
    }
}