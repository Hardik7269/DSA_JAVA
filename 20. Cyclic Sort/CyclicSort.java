import java.util.Arrays;
class CyclicSort{
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int sort(int [] arr){
        int idx = 0;
        while(idx < arr.length){
            int current = arr[idx] - 1;

            if(arr[idx] == arr[current]){
                idx++;
            }else {
                swap(arr, idx, current);
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[idx] == arr[current]){
                return idx;
            }
        }
        return -1;
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}