import java.util.Arrays;

class FirstMissingPositive41{
    public static void main(String[] args) {
        int[] arr = {-1,-2};
        firstMissingPositive(arr);
    }
    public  static int firstMissingPositive(int[] arr) {
        int i = 0; 
        while(i < arr.length){
            int current = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[current]){
                swap(arr, i , current);
            }else{
                i++;
            }
            
        }
        for(int idx = 0 ; idx < arr.length ; idx++){
            if(arr[idx] != idx - 1){
                return idx+1;
            }
        }
            
        return arr.length +1;
    }
    public static void swap(int[] arr , int a, int b){
        int temp = arr[a];
        arr[a] = arr[b] ;
        arr[b]  = temp;
    }
}