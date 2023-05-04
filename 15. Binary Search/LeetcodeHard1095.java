public class LeetcodeHard1095 {
    public static void main(String[] args) {
        int [] mountainArr = {1,12,34,40,50,3,1};
        int target = 3;
        System.out.println(findInMountainArray(target, mountainArr));
    }
 
    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);

        int output = binarySearch( mountainArr, target ,0 , peak);
        if(mountainArr[output] == target){
            return output;
        }else{
            binarySearch( mountainArr, target ,peak+1 , mountainArr.length);
        }
        return -1;
    }

     public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
                //cuz it may be the answer so check the left  
            }else{
                start = mid+1;
                //its in assencing order so check right side
            }
            //both values will be at same position then the contition will be break of while .. so basicaly both are at the max value 
        }
        return start;
    }
    public static int binarySearch(int[] arr,int target,int start , int end){

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
                if(arr[mid] > target){
                    start = mid+1;
                }else{
                    end = mid - 1 ;
                }
            }
        }
            return -1;
    }

}
