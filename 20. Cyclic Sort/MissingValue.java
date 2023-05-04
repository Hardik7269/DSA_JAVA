class MissingValue{
    public static void main(String[] args) {
        int[] arr ={3,0,1};
        sort(arr);
    }
    public static int sort(int []arr){
        int idx = 0;
        while(idx < arr.length){
            int curr = arr[idx];
            if(arr[idx] >= arr.length || arr[idx] == arr[curr] ){
                idx++;
            }
            else{
                swap(arr, arr[idx], arr[curr]);
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            
            if(arr[i] != i){
                return i;
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