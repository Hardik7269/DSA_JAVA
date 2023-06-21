import java.util.ArrayList;

class Sorted{
    static int count = 0;
    public static void main(String[] args) {
        int []arr = {1,2,2,3};
        int target = 2;

        // ************ check if the array is sorted or not
        // System.out.println(sort(arr , count));
        
        // ************ search index (linear search)
        // System.out.println(searchIndex(arr, count, target));
        
        // ************ return all the element's index
        // searchIndexAll(arr, count, target);
        // System.out.println(list);

        // ************ Declering the function inside the function
        System.out.println(searchCreatInsideList(arr, target, count));
    }

    //--------------------------------------------------------------------------------------------------------------------------------
    //Sorted array
    public static boolean sort(int []arr , int count){
        if(count == arr.length - 1){
            return true;
        }
        boolean check = arr[count] <= arr[count + 1] && sort(arr, count+1);
        return check;

    }  

    //----------------------------------------------------------------------------------------------------------
    //linear search
    public static boolean search(int[] arr, int count , int target){
        if(count == arr.length){
            return false;
        }
        boolean check = (arr[count] == target) || search(arr, count+1, target);
        return check;
    }

    //----------------------------------------------------------------------------------------------------------
    //linear search index
    public static int searchIndex(int[] arr, int count , int target){
        if(count == arr.length){
            return -1;
        }
        if(arr[count] == target){
            return count;
        } else{
            return searchIndex(arr, count+1, target);
        } 
        
    }

    //----------------------------------------------------------------------------------------------------------
    //returning all the same elements index
    // static ArrayList<Integer> list = new ArrayList<>();

    // static void searchIndexAll(int[] arr, int count , int target){
    //     if(count == arr.length -1){
    //         return;
    //     }
    //     if(arr[count] == target){
    //         list.add(count);
    //     }
    //     searchIndexAll(arr, count+1, target);
    // }
    
    //----------------------------------------------------------------------------------------------------------
    //creating arraylist inside the function
    public static ArrayList<Integer> searchCreatInsideList(int[] arr , int target , int count ){
        ArrayList<Integer> list = new ArrayList<>();

        if(count == arr.length){
            return list;
        }
        if(arr[count] == target){
            list.add(count);
        }
        ArrayList<Integer> forRet = searchCreatInsideList(arr, target, count+1);
  
        {
            // if(list.size() != 0){
        //     forRet.addAll(list);
        //     return forRet;
        // }else{
        //     return forRet;
        // }
}
        list.addAll(forRet);
        return list;

    }

}
