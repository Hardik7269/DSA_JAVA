class BinarySearch{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int target = 3;
        int bs = binarySearchSortedArray(arr, 0, arr.length-1, target);
        System.out.println(bs);
    }
    public static int binarySearchSortedArray(int[] arr , int start, int end, int target){
        int mid = start + (end - start)/2;

        if(start<=end && arr[mid] == target){
            return mid;
        }
        if (start<=end && arr[mid] < target ){
            return binarySearchSortedArray(arr, mid+1, end, target);
            
        }else if(start<=end && arr[mid] > target){
            return binarySearchSortedArray(arr, start, mid-1, target); 
        }
        return -1;
    }
}