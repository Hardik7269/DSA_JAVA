public class BinSearch{

    public static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        //if its sorted in reverse order
        boolean order = (arr[end] - arr[start] >= 0) ? true : false ;


        while(start <= end){
            int mid = start + (end-start)/2;

            if(order){
                if(arr[mid] == target){
                    return mid;
                }
                if(arr[mid] > target){
                    end = mid - 1 ;
                }else{
                    start = mid+1;
                }
            }else{
                if(arr[mid] == target){
                    return mid;
                }
                if(arr[mid]  < target){
                    end = mid - 1 ;
                    
                }else{
                    start = mid+1;
                }
            }
        }
            return -1;
    }

    public static void main(String [] args){
        int [] arr = {5,8,9,74,96,102,604};
        int [] rev = {984,854,601,258,61,30,9};
        int target = 9;
        System.out.println(binarySearch(arr,target));
        System.out.println("for reverse :" + binarySearch(rev, target));
    }
}