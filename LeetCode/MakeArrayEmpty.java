import java.util.*;
class MakeArrayEmpty{
    public static void main(String[] args) {
        int [] arr = {-15,-19,5};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            list.add(arr[i]);
        }
        long operation = 0;
        for(int i = 0 ; i < list.size() ; i++){
            for(int j = 1 ; j < list.size() - i ; j++){
                if(list.get(j) < list.get(j-1)){
                    swap(list, j, j-1);
                    operation++;
                }
            }
        }

        //now we have a list so check 1st 2 elements and remove setep by step

        while(list.size() >= 0){
            if(list.size() == 1){
                operation++;
                list.remove(0);
                break;
            }
            list.remove(0);
            operation++;
        }
        System.out.println(list);
        System.out.println(operation);
    
    }
    public static void swap(ArrayList<Integer> list, int a, int b){
        Collections.swap(list , a , b);
    }
}