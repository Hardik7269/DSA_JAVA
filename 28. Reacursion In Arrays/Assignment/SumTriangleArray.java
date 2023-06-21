class SumTriangleArray{

    public static int[] arr = {1,2,3,4,5,6};  
    public static void main(String[] args) {
        sum(arr, 0, arr.length-1);
        System.out.println(arr[0]);
    }
    public static int sum(int[] arr, int i , int count){

        if(count == 0){
            return 0;
        }
        if(i == count){

            return sum(arr, i=0 , count-1);

        }else{
            arr[i] = arr[i] + arr[i+1];
            return sum(arr, i+1, count);
            
        }
    }
}