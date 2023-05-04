class Bubblesort{
    public static void main(String[] args) {
        int[]arr = {0,1,0,2,0,1};
        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = 1 ; j < arr.length-i ; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}