import javax.naming.directory.SearchResult;

class BinarySearch{
    public static void main(String[] args) {
        int []arr = {1,2,6,9,10,89,98};
        int target = 10;
        System.out.println(search(arr, target, 0,arr.length-1));
    }
    public static int search(int[] arr , int target , int start , int end){
        int mid = start + (end - start) / 2 ;
        if(start > end){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            return search(arr , target , start , mid-1);
        }
        return search(arr , target , mid+1 , end);
    }
}