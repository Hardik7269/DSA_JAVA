class SearchInMountainArray{
    public static void main(String[] args) {
        int [] arr = {1,5,8,9,63,168,826};
        System.out.println(binarySearch(arr, 8, 0, arr.length));
    }

    public static int findInMountainArray(int target, MountainArray mountainArr) {
        
        
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

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length;

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
}