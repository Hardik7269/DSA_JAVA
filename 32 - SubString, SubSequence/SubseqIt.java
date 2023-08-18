import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SubseqIt{
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        // System.out.println(subset(arr));
        System.out.println(subsetIt(arr));
    }
    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static List<List<Integer>> subsetIt(int[]arr){
        List<List<Integer>> outer = new ArrayList<>();


        for(int i = 0 ; i < arr.length  ; i++){
            for(int j = i ; j  < arr.length ; j++){
                ArrayList<Integer> list = new ArrayList<>();
                for(int k = i ; k <= j ; k++){
                    list.add(arr[k]);
                }
                outer.add(list);
            }   
    
        }
        return outer;
    }
}