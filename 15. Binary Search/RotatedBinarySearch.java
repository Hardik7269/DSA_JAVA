public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] nums = {4,6,0};
        int target = 6;
        System.out.println(search(nums, target));     
    }
    
    public static int search(int[] nums, int target) {
        int piv = pvt(nums);
        
        if(piv == -1){
            // piv is -1 that means that its not roatted.. so do normal binary search
            return binarySearch(nums, target, 0, nums.length-1);
        }

        //there are 3 cases for finding element after finding pivit 
        //case 1 : if  piv is equal target
        if (nums[piv] == target){
            return piv;
        }
        //case 2 : if my start element is smaller then target means element is >> so its in 1st half
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, piv-1);
        }

        //case 3 : target is less then start
        return binarySearch(nums, target, piv+1, nums.length-1);
    }

    public static int pvt(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr , int target , int start , int end){
        while(start <= end){
            int mid = start + (end-start)/2;

                if(target < arr[mid]){
                    end = mid-1;
                }
                else if(target > arr[mid]){
                    start = mid + 1; 
                }
                else{
                    return mid;
                }
            }
            return -1;
    }

}
