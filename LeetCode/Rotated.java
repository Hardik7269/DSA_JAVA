import java.util.*;
class Rotated {
    public static void main(String[] args) {
        int []arr = {1,2};
        int k = 3;
        rotate(arr, k);
    }
    public static void rotate(int[] arr, int k) {

        if(arr.length <= k){
            k =  k % arr.length;
        }
        ArrayList<Integer> list = new ArrayList<>();
        //adding elements in list
        for(int i = arr.length-k ; i < arr.length ; i++){
           list.add(arr[i]); 
        }
        System.out.println(list);
        //swaping
        for(int i = arr.length - k -1 ; i >=0 ; i--){
            swap(arr , i , i+k);
        }

        //adding back element
        for(int i = k ; i < arr.length ; i++){
            list.add(arr[i]);
        }

        System.out.print(list);
        
    }

    public static void swap(int[] arr ,int  a ,int  b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}